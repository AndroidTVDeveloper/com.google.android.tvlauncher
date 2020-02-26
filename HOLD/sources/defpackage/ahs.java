package defpackage;

/* renamed from: ahs  reason: default package */
/* compiled from: PG */
public final class ahs extends cl {
    public int d;

    public final void clear() {
        this.d = 0;
        super.clear();
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = super.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    public final Object put(Object obj, Object obj2) {
        this.d = 0;
        return super.put(obj, obj2);
    }

    public final Object d(int i) {
        this.d = 0;
        return super.d(i);
    }

    public final Object a(int i, Object obj) {
        this.d = 0;
        return super.a(i, obj);
    }
}
