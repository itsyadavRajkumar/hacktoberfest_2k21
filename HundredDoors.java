class HundredDoors {
    public static void main(String[] args) {
        boolean[] doors = new boolean[101];
        int i = 1;
        for(boolean b : doors){
            for (int j = i; j < doors.length; j += i) {
                doors[j] = !doors[j];
            }
            i++;
        }
        for (int a = 1; a < doors.length; a++) {
            if (doors[a]) {
                System.out.printf("Door %d is open.%n", a);
            }
        }
    }
}
