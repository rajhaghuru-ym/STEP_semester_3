package class_problems;

class PlacementRecord {
    String studentName;
    String company;
    double packageLpa;

    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }

    public static void main(String[] args) {

        PlacementRecord s1 = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord s2 = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord s3 = new PlacementRecord("Karthik", "Infosys", 4.0);


        PlacementRecord[] records = new PlacementRecord[3];
        records[0] = s1;
        records[1] = s2;
        records[2] = s3;


        for (int i = 0; i < records.length; i++) {
            records[i].printRecord();
        }
    }
}