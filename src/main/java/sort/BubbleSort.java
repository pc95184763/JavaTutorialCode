package sort;

public class BubbleSort {

  public void bubble(Integer[] data) {

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - 1 - i; j++) {

        //如果后一个数小于前一个数，则两个数互相交换位置
        if (data[j] > data[j + 1]) {
          int tmp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = tmp;
        }
      }
    }
  }
}
