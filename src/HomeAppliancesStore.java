public class HomeAppliancesStore {

    static String name;
    static String address;
    static Integer employees;


    public static void main(String args[]) {

        setName(args[0]);
        setAddress(args[1]);
        setEmployees(Integer.parseInt(args[2]));

        if (args[0] == null) {
            System.out.println("ERROR");
        }

        if (args[0] != null) {
            try {
                name = args[0];
            } catch (Exception e) {}
        }

        if (args[1] == null) {
            System.out.println("ERROR");
        }

        if (args[1] != null) {
            try {
                address = args[1];
            } catch (Exception e) {
            }
        }

        if (args[2] == null) {
            System.out.println("ERROR");
        }

        if (args[2] != null) {
            try {
                employees = Integer.parseInt(args[2]);
            } catch (Exception e) {}
        }

        System.out.println(getName() + getAddress() + getEmployees());

    }
    static void setName(String name){}
    static void setAddress(String address){}
    static void setEmployees(Integer employees){}

    static String getName(){
        return name;
    }
    static String getAddress() {
        return address;
    }
    static Integer getEmployees() {
        return employees;
    }
}