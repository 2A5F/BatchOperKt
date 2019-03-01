package batchOper

inline fun<reified O, reified A> O.eqOr(a: A) =
    this == a
inline fun<reified O, reified A, reified B> O.eqOr(a: A, b: B) =
    this == a || this == b
inline fun<reified O, reified A, reified B, reified C> O.eqOr(a: A, b: B, c: C) =
    this == a || this == b || this == c
inline fun<reified O, reified A, reified B, reified C, reified D> O.eqOr(a: A, b: B, c: C, d: D) =
    this == a || this == b || this == c || this == d
inline fun<reified O, reified A, reified B, reified C, reified D, E> O.eqOr(a: A, b: B, c: C, d: D, e: E) =
    this == a || this == b || this == c || this == d || this == e
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F> O.eqOr(a: A, b: B, c: C, d: D, e: E, f: F) =
    this == a || this == b || this == c || this == d || this == e || this == f
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F, reified G> O.eqOr(a: A, b: B, c: C, d: D, e: E, f: F, g: G) =
    this == a || this == b || this == c || this == d || this == e || this == f || this == g
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F, reified G, reified H> O.eqOr(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H) =
    this == a || this == b || this == c || this == d || this == e || this == f || this == g || this == h
inline fun<reified O> O.eqOr(vararg items: Any) : Boolean {
    for (item in items) {
        if(this == item) return true
    }
    return false
}


inline fun<reified O, reified A> O.eqAnd(a: A) =
    this == a
inline fun<reified O, reified A, reified B> O.eqAnd(a: A, b: B) =
    this == a && this == b
inline fun<reified O, reified A, reified B, reified C> O.eqAnd(a: A, b: B, c: C) =
    this == a && this == b && this == c
inline fun<reified O, reified A, reified B, reified C, reified D> O.eqAnd(a: A, b: B, c: C, d: D) =
    this == a && this == b && this == c && this == d
inline fun<reified O, reified A, reified B, reified C, reified D, reified E> O.eqAnd(a: A, b: B, c: C, d: D, e: E) =
    this == a && this == b && this == c && this == d && this == e
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F> O.eqAnd(a: A, b: B, c: C, d: D, e: E, f: F) =
    this == a && this == b && this == c && this == d && this == e && this == f
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F, reified G> O.eqAnd(a: A, b: B, c: C, d: D, e: E, f: F, g: G) =
    this == a && this == b && this == c && this == d && this == e && this == f && this == g
inline fun<reified O, reified A, reified B, reified C, reified D, reified E, reified F, reified G, reified H> O.eqAnd(a: A, b: B, c: C, d: D, e: E, f: F, g: G, h: H) =
    this == a && this == b && this == c && this == d && this == e && this == f && this == g && this == h
inline fun<reified O> O.eqAnd(vararg items: Any) : Boolean {
    for (item in items) {
        if(this != item) return false
    }
    return true
}


class Eq<X>(val x: X) {
    inline operator fun<reified V> V.invoke() = x == this
    inline infix fun<reified V> Boolean.oor(v: V) = this || x == v
    inline infix fun<reified T, reified V> T.oor(v: V) = x == this || x == v
    inline infix fun<reified V> Boolean.aand(v: V) = this && x == v
    inline infix fun<reified T, reified V> T.aand(v: V) = x == this && x == v
}

inline fun<reified X> X.eq(block: Eq<X>.() -> Boolean) = block(Eq(this))

class Eq2<X>(val x: X) {
    inline operator fun<reified V> V.invoke() = x == this
    inline infix fun<reified V> Boolean.oor(v: V) = this || x == v
    inline infix fun<reified T, reified V> T.oor(v: V) = x == this || x == v
    inline infix fun<reified V> Boolean.aand(v: V) = this && x == v
    inline infix fun<reified T, reified V> T.aand(v: V) = x == this && x == v
}

inline fun<reified X> X.eq2(block: Eq2<X>.() -> Boolean) = block(Eq2(this))
