public class FaultySensorDetection {

    public static boolean detectFaultySensor(int[] sensorReadings) {
        
        int faultThreshold = 50; 

    
        for (int reading : sensorReadings) {
           
            if (reading > faultThreshold) {
                return true; // If any reading exceeds the threshold, consider it faulty
            }
        }

        
        return false;
    }

    public static void main(String[] args) {
     
        int[] readings = {25, 30, 28, 55, 32, 29};

       
        boolean isFaulty = detectFaultySensor(readings);

        if (isFaulty) {
            System.out.println("Faulty sensor detected!");
        } else {
            System.out.println("All sensors are working within the normal range.");
        }
    }
}
