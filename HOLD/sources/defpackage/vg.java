package defpackage;

/* renamed from: vg  reason: default package */
/* compiled from: PG */
final class vg extends RuntimeException {
    public static final long serialVersionUID = -7530898992688511851L;

    public vg(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
