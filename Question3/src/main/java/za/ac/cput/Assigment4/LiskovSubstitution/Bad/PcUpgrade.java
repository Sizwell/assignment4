package za.ac.cput.Assigment4.LiskovSubstitution.Bad;

public class PcUpgrade {
    public void PcUpgrade(Computer computer)
    {
        computer.speed += 8;

        if(computer.getClass() != Desktop.class)
            computer.speed += 1;
    }

    /*
    *     public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }*/
}
