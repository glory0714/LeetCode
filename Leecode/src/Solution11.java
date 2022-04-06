class Solution11 {
    public int minArray(int[] numbers) {
        return min(0,numbers.length-1,numbers);
    }
    public int min(int low,int high,int[] numbers){
        int i=0;
        if(numbers[low]<numbers[high]){return numbers[low];}
        if(high==low){return numbers[low];}
        if(high-low==1){if(numbers[low]>numbers[high]){return numbers[high];}else{
            return numbers[low];}
        }
        int mid=(high+low)/2;

        if(numbers[low]>numbers[mid]){
            if(numbers[mid-1]>numbers[mid]){
                return numbers[mid];
            }else{
                return min(low,mid,numbers);
            }
        }else if(numbers[low]<numbers[mid]){
            return min(mid,high,numbers);
        }else{
            if(numbers[mid]>numbers[high]){
                return min(mid,high,numbers);
            }else{
                i=min(mid,high,numbers);
                if(min(low,mid,numbers)>i){
                    return i;
                }else{
                    return min(low,mid,numbers);
                }
            }
        }
    }
}