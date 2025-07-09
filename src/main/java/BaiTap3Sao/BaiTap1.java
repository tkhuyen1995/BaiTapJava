package BaiTap3Sao;

public class BaiTap1 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;                     // con trỏ đầu mảng
        int right = numbers.length - 1;   // con trỏ cuối mảng

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // +1 vì đề yêu cầu chỉ số bắt đầu từ 1
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // cần tổng lớn hơn → dịch trái sang phải
            } else {
                right--; // tổng quá lớn → dịch phải sang trái
            }
        }
//        Không tìm thấy cặp thỏa mãn sẽ trả giá trị “không hợp lệ”
        return new int[] {};
    }
}
