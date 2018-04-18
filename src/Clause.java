import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;

public class Clause {

    private ArrayList<Pair<Character,Boolean>> literals;

    public Clause(Pair<Character,Boolean>... literals) {
        this.literals = new ArrayList<Pair<Character,Boolean>>();
        this.literals.addAll(Arrays.asList(literals));
    }

    public Clause(Clause c1,Clause c2) {
        this.literals = new ArrayList<Pair<Character,Boolean>>();
        literals.addAll(c1.getLiterals());
        literals.addAll(c2.getLiterals());
    }

    public ArrayList<Pair<Character, Boolean>> getLiterals() {
        return literals;
    }

    public void removeLiterals(Clause clause) {
        literals.removeAll(clause.getLiterals());
    }

    public void addLiterals(Pair<Character,Boolean>... literals) {
        this.literals.addAll(Arrays.asList(literals));
    }

    public int size() {
        return literals.size();
    }

    @Override
    public boolean equals(Object other) {
        Clause otherClause = (Clause) other;
        return (literals.equals(otherClause.literals));
    }
}
