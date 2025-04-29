public class PetMachine {
    
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet = null;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para inicar o banho");
            return;
        } else if (this.water < 10 || this.shampoo < 2) {
            System.out.println("A máquina não tem shampoo ou água suficiente, por gentileza reabastecer.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("o Pet " +  pet.getName() + " está limpo");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }

        water += 10;
    }
    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }

        shampoo += 2;
    }
    
    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;

    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        if (hasPet()) {
            System.out.println("o Pet " +  this.pet.getName() + " está na máquina neste momento");
            return;
        }
        this.pet = pet;    
        System.out.println("o Pet " +  pet.getName() + " foi colocado na máquina");    
    }
    public void removePet(){
        if (!hasPet()) {
            System.out.println("Não há pet na máquina");
            return;
        }
        this.clean = this.pet.isClean();
        System.out.println("o Pet " +  pet.getName() + " foi retirado da máquina");
        this.pet = null;
    }

    public void wash(){
        if (this.water < 10 || this.shampoo < 2) {
            System.out.println("A máquina não tem shampoo ou água suficiente, por gentileza reabastecer.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
    
}
