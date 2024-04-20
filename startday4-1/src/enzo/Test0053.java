package enzo;

import org.testng.annotations.Test;

/**
 * Package: enzo
 * Description:
 *
 * @Author ENZO
 * @Create 2024��4��8�� 20:35
 */
public class Test0053 {
    //������
    public int maxSubArray1(int[] nums) {
        int length = nums.length;
        int sum = nums[0];
        for (int i = 0; i < length; i++) {
            int temp = 0;       //��һ������
            for (int j = i; j < length; j++) {
                temp = temp + nums[j];
                sum = Math.max(sum, temp);
            }
        }
        return sum;
    }


    // ��̬�滮

    public int maxSubAray1(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            //pre��ά�����ڵ�ǰf(i)��f(i?1)��ֵ�Ƕ���
            pre = Math.max(pre + x, x);//�ж�f(i-1)�Ƿ�Ҫ�ӵ���ǰ����
            maxAns = Math.max(maxAns, pre);//��ȡ���ֵ
        }
        return maxAns;
    }

    // ̰�ķ�

    public int maxSubAray2(int[] nums) {
        //����Ѱ�������Сֵ����Ŀ,��ʼֵһ��Ҫ����������ϵ���С���ֵ
        int result = Integer.MIN_VALUE;
        int numsSize = nums.length;
        int sum = 0;
        for (int i = 0; i < numsSize; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            //���sum < 0,���¿�ʼ������
            if (sum < 0) {
                sum = 0;
            }
        }

        return result;
    }


    // ���η�: �߶���

    public int maxSubAray3(int[] nums) {
        if (nums == null || nums.length <= 0)// ����У��
            return 0;
        int len = nums.length;// ��ȡ���볤��
        return getInfo(nums, 0, len - 1).mSum;
    }

    static class wtevTree { //�߶���
        int lSum;// ��������Ϊ�˵������Ӷκ�
        int rSum;// ��������Ϊ�˵������Ӷκ�
        int iSum;// �����������ĺ�
        int mSum;// �����������Ӷκ�

        wtevTree(int l, int r, int i, int m) { // ���캯��
            lSum = l;
            rSum = r;
            iSum = i;
            mSum = m;
        }
    }

    // ͨ�����е�����,������һ�������,һ�������Ϸ���,����߶���
    wtevTree pushUp(wtevTree leftT, wtevTree rightT) {
        // ���Ӷε�lSum�����������lSum����������� ����� �����������lSum
        int l = Math.max(leftT.lSum, leftT.iSum + rightT.lSum);
        // ���Ӷε�rSum�����������rSum����������� ����� �����������rSum
        int r = Math.max(leftT.rSum + rightT.iSum, rightT.rSum);
        // ���Ӷε�����͵�����������������֮��
        int i = leftT.iSum + rightT.iSum;
        // ���Ӷε�����Ӷκ�,���Ӷ��п��ܴ�����������,��������,��������
        int m = Math.max(leftT.rSum + rightT.lSum, Math.max(leftT.mSum, rightT.mSum));
        return new wtevTree(l, r, i, m);
    }

    // �ݹ齨���ͻ���������������ӶεĽṹ
    wtevTree getInfo(int[] nums, int left, int right) {
        if (left == right) // �����䳤��Ϊ1,���ĸ��Ӷξ�Ϊ��ֵ
            return new wtevTree(nums[left], nums[left], nums[left], nums[left]);
        int mid = (left + right) >> 1;// ����м��mid,����һλ�൱�ڳ���2,�������
        wtevTree leftT = getInfo(nums, left, mid);
        wtevTree rightT = getInfo(nums, mid + 1, right);//mid+1,��������û�н�����
        return pushUp(leftT, rightT);//�ݹ������,�����һ�κϲ�
    }


    @Test
    public void test() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int[] arr2 = {-1};
        System.out.println(maxSubAray1(arr));
        //System.out.println(maxSubArray(arr2));
    }
}
