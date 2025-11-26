/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int countEvenNumber = 0;
        for(int i = 0; i< nums.length; i++){
            int value = nums[i];
            if (value < 10)
                continue;
            int digits = 0;

            while (value > 0) {
                digits++; 
                value = value / 10;
            }
            
            if (digits % 2 == 0)
                countEvenNumber++;

        }
        return countEvenNumber;
    }
}
// @lc code=end

// @Document 
/*
  * Bài toán yêu cầu đếm tổng số lượng các số trong mảng có chữ số là số chẵn
  * Input : mảng số nguyên
  * Output : tổng số lượng các số có chữ số là số chẵn
  ====================================================
# Ý tưởng thuật toán: Với mỗi số trong mảng ta thực hiện điếm số chữ số nếu
  là số chẵn ta tăng biến đếm lên 1 (bỏ qua các số nhỏ hơn 10 vì chỉ có 1 chữ số)

  # Chi tiết các bước bước thực hiện  
    
  * Khởi tạo biến countEvenNumber dùng để điếm số lượng các số chẵn có chữ số chẵn trong mảng.
  * Duyệt qua từng phần tử trong mảng:
  * Nếu nhỏ hơn 10 => bỏ qua
  * khởi tạo biến digits để đếm số lượng chữ số của số khi đang duyệt mảng.
  * Thực hiện chia value cho 10 và tăng biến digits (thỏa mản sau khi bị chia số vẫn lớn 0)
  * Nếu digits % 2 thì số đươc duyệt là số có tổng chữ số là số chẵn => tăng biến countEvenNumber++
  * Hết vòng lặp trả về countEvenNumber;

   
*/

