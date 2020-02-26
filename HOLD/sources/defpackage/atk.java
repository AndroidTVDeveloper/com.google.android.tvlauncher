package defpackage;

/* renamed from: atk  reason: default package */
/* compiled from: PG */
final /* synthetic */ class atk implements ats {
    public static final ats a = new atk();

    private atk() {
    }

    public final int a(Object obj) {
        int i = att.a;
        String str = ((atd) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (blm.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
