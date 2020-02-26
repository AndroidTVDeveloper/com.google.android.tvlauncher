package defpackage;

/* renamed from: cob  reason: default package */
/* compiled from: PG */
public enum cob {
    INLINE("InLine"),
    WRAPPER("Wrapper");
    
    public final String c;

    public final String toString() {
        return this.c;
    }

    private cob(String str) {
        this.c = str;
    }
}
