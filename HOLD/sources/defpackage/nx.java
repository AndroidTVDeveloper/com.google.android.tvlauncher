package defpackage;

/* renamed from: nx  reason: default package */
/* compiled from: PG */
public class nx {
    public int a = -1;
    public int b = 0;
    public float c = 50.0f;

    public final void a(float f) {
        if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
            throw new IllegalArgumentException();
        }
        this.c = f;
    }
}
