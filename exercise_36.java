public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false;
        for(int i = 0; i < 9; i++){
            if(!isValid(board, i, 0, i, 8))
                return false;
            if(!isValid(board, 0, i, 8, i))
                return false;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                if(!isValid(board, i*3, j*3, i*3+2, j*3+2))
                    return false;
        }
        return true;
    }
    
    public boolean isValid(char[][] array, int x1, int y1, int x2, int y2){
        Set set = new HashSet();
        for(int i = x1; i <= x2; i++){
            for(int j = y1; j <= y2; j++){
                if(array[i][j] != '.') 
                    if(!set.add(array[i][j]))
                        return false;
            }
        }
        return true;
    }
}

//set���ñ������д�ŵĶ��������
//set�������ʧ���򷵻�-1�������ڲ����Գ����ظ�Ԫ�أ����set��������ȥ��
//if����漰����������ò�Ҫ����д������ʹ��Ƕ��д����