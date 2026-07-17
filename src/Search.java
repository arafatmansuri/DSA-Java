class SearchResult {
    boolean isFound;
    int index;
    SearchResult(boolean isFound,int index){
        this.isFound = isFound;
        this.index = index;
    }
}
public class Search {
    int[] numbers;

    Search(int[] numbers){
        this.numbers = numbers;
    }

    public boolean linearSearch(int no){
        for (int number : numbers) {
            if (number == no)
                return true;
        }
        return false;
    }
    public SearchResult binarySearch(int no){
        int start = 0;
        int end = numbers.length - 1;
        boolean flag = false;
        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == no) {
                return new SearchResult(true,mid);
            }
            else if (no > numbers[mid])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return new SearchResult(flag,index);
    }
    public int recursiveBinarySearch(int no,int start, int end){
        if(start <= end){
            int mid = (start + end) / 2;
            if (numbers[mid] == no) {
                return mid;
            }
            else if (no > numbers[mid])
                return recursiveBinarySearch(no,mid+1,end);
            else
                return recursiveBinarySearch(no,start,mid-1);
        }
        return -1;
    }
}
