public class paintJob {
    public static void main(String[] args) {
int result = getBucketCount(3.4,1.5);
        System.out.println(result);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double bucketsNeeded;
        double area;
        if(width <=0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0){
            return-1;
        }else{
            area = width * height;
            bucketsNeeded = area/areaPerBucket;
            bucketsNeeded-= extraBuckets;

        }int newArea = (int) area;
//        int roundBucketsNeeded = (int) Math.ceil(bucketsNeeded);
        return (int) Math.ceil(bucketsNeeded);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double bucketsNeeded;
        double area;
        if(width <=0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            area = width * height;
            bucketsNeeded = area/areaPerBucket;
        }return (int) Math.ceil(bucketsNeeded);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        double bucketsNeeded;
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
           bucketsNeeded = area/areaPerBucket;
        }return (int) Math.ceil(bucketsNeeded);
    }
}

