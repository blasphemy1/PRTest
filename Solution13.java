/*
 * @Description:
 * 棰滆壊鍒嗙被
 * 缁欏畾涓�涓寘鍚孩鑹层�佺櫧鑹插拰钃濊壊銆佸叡 n 涓厓绱犵殑鏁扮粍 nums 锛屽師鍦板瀹冧滑杩涜鎺掑簭锛屼娇寰楃浉鍚岄鑹茬殑鍏冪礌鐩搁偦锛屽苟鎸夌収绾㈣壊銆佺櫧鑹层�佽摑鑹查『搴忔帓鍒椼��
 * 鎴戜滑浣跨敤鏁存暟 0銆� 1 鍜� 2 鍒嗗埆琛ㄧず绾㈣壊銆佺櫧鑹插拰钃濊壊銆�
 * 蹇呴』鍦ㄤ笉浣跨敤搴撳唴缃殑 sort 鍑芥暟鐨勬儏鍐典笅瑙ｅ喅杩欎釜闂銆�
 * 
 * 绀轰緥 1锛�
 * 杈撳叆锛歯ums = [2,0,2,1,1,0]
 * 杈撳嚭锛歔0,0,1,1,2,2]
 * 
 * 绀轰緥 2锛�
 * 杈撳叆锛歯ums = [2,0,1]
 * 杈撳嚭锛歔0,1,2]
 */

class Solution13{
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                int temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ++ptr;
            }
        }
    }
}
