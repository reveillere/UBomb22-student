package fr.ubx.poo.ubomb.go;

import fr.ubx.poo.ubomb.go.decor.bonus.Key;

// Double dispatch visitor pattern
public interface TakeVisitor {
    // Key
    default void take(Key key) {
    }


}
