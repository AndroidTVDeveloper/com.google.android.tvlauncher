package p000;

import java.util.List;

/* renamed from: bdo */
/* compiled from: PG */
final class bdo implements bdp {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final bdm mo1784a(akh akh) {
        char c;
        String str = akh.f556i;
        switch (str.hashCode()) {
            case -1351681404:
                if (str.equals("application/dvbsubs")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1248334819:
                if (str.equals("application/pgs")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1026075066:
                if (str.equals("application/x-mp4-vtt")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (str.equals("text/vtt")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 691401887:
                if (str.equals("application/x-quicktime-tx3g")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 822864842:
                if (str.equals("text/x-ssa")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 930165504:
                if (str.equals("application/x-mp4-cea-608")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1566015601:
                if (str.equals("application/cea-608")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1566016562:
                if (str.equals("application/cea-708")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 1668750253:
                if (str.equals("application/x-subrip")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1693976202:
                if (str.equals("application/ttml+xml")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new bfq();
            case 1:
                return new bet(akh.f558k);
            case 2:
                return new bfi();
            case 3:
                return new bfa();
            case 4:
                return new bev();
            case 5:
                return new bff(akh.f558k);
            case 6:
            case 7:
                return new bdw(str, akh.f545B);
            case 8:
                int i = akh.f545B;
                List list = akh.f558k;
                return new bea(i);
            case 9:
                return new bef(akh.f558k);
            case 10:
                return new ber();
            default:
                throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
