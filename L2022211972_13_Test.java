import java.util.Arrays;

// 测试类写的规范又具体，除此之外可以尝试使用断言进行单元测试。

class
 L2022211972_13_Test {
	
	 static Solution13 so = new Solution13();
  //对元素个数为0的用例测试
  //测试用例:[]
  public static boolean test1() {
	  int nums[] = {};
	  int answer[] = {};
	  so.sortColors(nums);

	  if(Arrays.equals(nums,answer)) {
		  return true;
	  }
	  return false;
  }
  
  //对元素个数为1的用例测试
  //测试用例:[0]
  public static boolean test2() {
	  int nums[] = {0};
	  int answer[] = {0};
	  so.sortColors(nums);
	  if(Arrays.equals(nums,answer)) {
		  return true;
	  }
	  return false;
  }
  
  //对元素个数为2的用例测试
  //1.两个元素相同
  //2.两个元素不同
  //测试用例[0,0],[1,2]
  public static boolean test3() {
	  boolean flag = true;
	  int nums1[] = {0,0};
	  int answer1[] = {0,0};
	  so.sortColors(nums1);
	  if(!Arrays.equals(nums1,answer1)) {
		  flag = false;
	  }
	  
	  int nums2[] = {1,2};
	  int answer2[] = {1,2};
	  so.sortColors(nums2);
	  if(!Arrays.equals(nums2,answer2)) {
		  flag = false;
	  }
	  return flag;
  }
  
  //对三个元素的用例测试
  //1.三个元素相同
  //2.只有两个元素相同
  //3.三个元素均不相同
  //测试用例:[0,0,0] [0,0,1] [0,1,2]
  
  public static boolean test4() {
	  boolean flag = true;
	  int nums1[] = {0,0,0};
	  int answer1[] = {0,0,0};
	  so.sortColors(nums1);
	  if(!Arrays.equals(nums1,answer1)) {
		  flag = false;
	  }
	  
	  int nums2[] = {0,0,1};
	  int answer2[] = {0,0,1};
	  so.sortColors(nums2);
	  if(!Arrays.equals(nums2,answer2)) {
		  flag = false;
	  }
	  
	  int nums3[] = {0,1,2};
	  int answer3[] = {0,1,2};
	  so.sortColors(nums3);
	  if(!Arrays.equals(nums3,answer3)) {
		  flag = false;
	  }
	  return flag;
  }

	 public static void main(String[] args) {
		 boolean flag = true;
		 if (!test1()) {
			 System.out.println(flag);
			 flag = false;
		 }
		 if (!test2()) {
			 System.out.println(flag);
			 flag = false;
		 }
		 if (!test3()) {
			 System.out.println(flag);
			 flag = false;
		 }
		 if (!test4()) {
			 System.out.println(flag);
			 flag = false;
		 }
		 System.out.println(flag);
		 if (flag) {
			 System.out.println("test success!");
		 }
	 }
}
