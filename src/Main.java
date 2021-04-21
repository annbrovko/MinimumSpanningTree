import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        int vertices = 15;

        Graph g = new Graph(vertices);

        g.addEdge("Eskildstrup", "Maribo", 28);
        g.addEdge("Eskildstrup", "Nykøbing F", 13);
        g.addEdge("Eskildstrup", "Vordingborg", 24);
        g.addEdge("Haslev", "Korsør", 60);
        g.addEdge("Haslev", "Køge", 24);
        g.addEdge("Haslev", "Næstved", 25);
        g.addEdge("Haslev", "Ringsted", 19);
        g.addEdge("Haslev", "Roskilde", 47);
        g.addEdge("Haslev", "Slagelse", 48);
        g.addEdge("Haslev", "Sorø", 34);
        g.addEdge("Haslev", "Vordingborg", 40);
        g.addEdge("Holbæk", "Jægerspris", 34);
        g.addEdge("Holbæk", "Kalundborg", 44);
        g.addEdge("Holbæk", "Korsør", 66);
        g.addEdge("Holbæk", "Ringsted", 36);
        g.addEdge("Holbæk", "Rosklide", 32);
        g.addEdge("Holbæk", "Slagelse", 46);
        g.addEdge("Holbæk", "Sorø", 34);
        g.addEdge("Jægerspris", "Korsør", 95);
        g.addEdge("Jægerspris", "Køge", 58);
        g.addEdge("Jægerspris", "Ringsted", 56);
        g.addEdge("Jægerspris", "Roskilde", 33);
        g.addEdge("Jægerspris", "Slagelse", 74);
        g.addEdge("Jægerspris", "Sorø", 63);
        g.addEdge("Kalundborg", "Ringsted", 62);
        g.addEdge("Kalundborg", "Roskilde", 70);
        g.addEdge("Kalundborg", "Slagelse", 39);
        g.addEdge("Kalundborg", "Sorø", 51);
        g.addEdge("Korsør", "Næstved", 45);
        g.addEdge("Korsør", "Slagelse", 20);
        g.addEdge("Køge", "Næstved", 45);
        g.addEdge("Køge", "Ringsted", 28);
        g.addEdge("Køge", "Roskilde", 25);
        g.addEdge("Køge", "Vordingborg", 60);
        g.addEdge("Maribo", "Nakskov", 27);
        g.addEdge("Maribo", "Nykøbing F", 26);
        g.addEdge("Næstved", "Roskilde", 57);
        g.addEdge("Næstved", "Ringsted", 26);
        g.addEdge("Næstved", "Slagelse", 37);
        g.addEdge("Næstved", "Sorø", 32);
        g.addEdge("Næstved", "Vordingborg", 28);
        g.addEdge("Ringsted", "Roskilde", 31);
        g.addEdge("Ringsted", "Sorø", 15);
        g.addEdge("Ringsted", "Vordingborg", 58);
        g.addEdge("Slagelse", "Sorø", 14);
    }

}
