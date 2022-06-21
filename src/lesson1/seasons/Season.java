package lesson1.seasons;

public enum Season {

    WINTER(-10.2),
    SPRING(7),
    SUMMER(29){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(9);

    private double averageTemperature;

    Season(double averageTemperature){
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature(){
        return averageTemperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
