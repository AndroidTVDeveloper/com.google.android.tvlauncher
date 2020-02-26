package defpackage;

/* renamed from: aty  reason: default package */
/* compiled from: PG */
final class aty implements atz {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final atx b(akh akh) {
        char c;
        String str = akh.i;
        switch (str.hashCode()) {
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return new avb();
        }
        if (c == 1) {
            return new auf();
        }
        if (c == 2) {
            return new avq();
        }
        if (c == 3) {
            return new auj();
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
    }

    public final boolean a(akh akh) {
        String str = akh.i;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
    }
}
