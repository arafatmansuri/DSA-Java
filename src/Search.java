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
        while (start <=end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == no) {
                flag = true;
                index = mid;
            }
            else if (no > numbers[mid])
                start = mid + 1;
            else if (no < numbers[mid])
                end = mid - 1;

        }
        return new SearchResult(flag,index);
    }
}
