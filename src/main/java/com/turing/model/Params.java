package com.turing.model;

import com.turing.Rules;
import com.turing.Tape;

public class Params {
    private Rules rules;
    private Tape tape;
    public Params(){}

    public Params(Rules rules, Tape tape, String firstState) {
        this.rules = rules;
        this.tape = tape;
    }

    public Rules getRules() {
        return rules;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public Tape getTape() {
        return tape;
    }

    public void setTape(Tape tape) {
        this.tape = tape;
    }
}
