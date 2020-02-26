package p000;

/* renamed from: atk */
/* compiled from: PG */
final /* synthetic */ class atk implements ats {

    /* renamed from: a */
    public static final ats f2391a = new atk();

    private atk() {
    }

    /* renamed from: a */
    public final int mo1333a(Object obj) {
        int i = att.f2399a;
        String str = ((atd) obj).f2328a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (blm.f4293a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
