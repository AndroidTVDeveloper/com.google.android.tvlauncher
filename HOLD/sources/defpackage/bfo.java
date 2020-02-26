package defpackage;

/* renamed from: bfo  reason: default package */
/* compiled from: PG */
final class bfo implements Comparable {
    public final bfk a;
    private final int b;

    public bfo(int i, bfk bfk) {
        this.b = i;
        this.a = bfk;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((bfo) obj).b;
    }
}
