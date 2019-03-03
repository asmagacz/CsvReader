class Team {
    // prosze zaprojektowac klase Team
    // prosze zadbac o odpowiednia implementacje pol klasy
    // prosze zaimplementowac odpowiedni konstruktor oraz metody,
    // ktore zwracaja pola klasy
    // prosze zaimplementowac metode toString
    // przed implementacja prosze przeanalizowac plik CSV
    // (http://tomaszgadek.com/static/ekstraklasa.csv)
    // oraz klase Main
    private int id;
    private String name;
    private int points;
    private int wins;
    private int loses;
    private int draws;

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", points=" + points +
                ", wins=" + wins +
                ", loses=" + loses +
                ", draws=" + draws +
                '}';
    }

    public Team(int id, String name, int points, int wins, int loses, int draws) {
        this.id = id;
        this.name = name;
        this.points = points;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }


}
