public enum houses {
    LIG("1 BHK","2.5"),
    MIG("2 BHK","3.5"),
    HIG("3 BHK","4.5");
    private final String desc;
    private final String rate;

    houses(String des,String Rate)
    {
        desc=des;
        rate=Rate;
    }
    public String getDesc()
    {
        return desc;
    }
    public String getRate()
    {
        return rate;
    }

    public static void main(String[] args) {
        for(houses h:houses.values())
            System.out.println("House Type: "+h.name() + " "+h.getDesc()+"\n"+"Value in Million: "+h.getRate());
    }
}
