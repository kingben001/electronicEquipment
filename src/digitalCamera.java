public class digitalCamera {
    private static String deviceName;
    private static double weight;
    private static double cost;
    private static int powerUsage;
    private static String brand;
    public digitalCamera(String DeviceName, int PowerUsage, String Brand, double Weight, double Cost) {
        deviceName = DeviceName;
        powerUsage = PowerUsage;
        brand = Brand;
        weight = Weight;
        cost = Cost;

    }
    public String toString(){
        return "Device Name: " + deviceName + ".\nPower Usage: " + powerUsage+ " watts.\nBrand: " + brand + "\nWeight: " + weight + "\nCost: " + cost;
    }
}