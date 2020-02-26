package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bet */
/* compiled from: PG */
public final class bet extends anm {

    /* renamed from: d */
    private static final Pattern f3592d = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: e */
    private final boolean f3593e;

    /* renamed from: f */
    private int f3594f;

    /* renamed from: g */
    private int f3595g;

    /* renamed from: h */
    private int f3596h;

    /* renamed from: i */
    private int f3597i;

    public bet() {
        this(null);
    }

    public bet(List list) {
        if (list == null || list.isEmpty()) {
            this.f3593e = false;
            return;
        }
        this.f3593e = true;
        String a = blm.m3640a((byte[]) list.get(0));
        bks.m3510a(a.startsWith("Format: "));
        m3002a(a);
        m3001a(new bky((byte[]) list.get(1)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bdl mo1155a(byte[] bArr, int i, boolean z) {
        long j;
        ArrayList arrayList = new ArrayList();
        bkq bkq = new bkq();
        bky bky = new bky(bArr, i);
        if (!this.f3593e) {
            m3001a(bky);
        }
        while (true) {
            String r = bky.mo2091r();
            if (r == null) {
                bdj[] bdjArr = new bdj[arrayList.size()];
                arrayList.toArray(bdjArr);
                return new beu(bdjArr, bkq.mo2048a());
            } else if (!this.f3593e && r.startsWith("Format: ")) {
                m3002a(r);
            } else if (r.startsWith("Dialogue: ")) {
                if (this.f3594f != 0) {
                    String[] split = r.substring(10).split(",", this.f3594f);
                    if (split.length != this.f3594f) {
                        Log.w("SsaDecoder", r.length() == 0 ? new String("Skipping dialogue line with fewer columns than format: ") : "Skipping dialogue line with fewer columns than format: ".concat(r));
                    } else {
                        long b = m3003b(split[this.f3595g]);
                        if (b == -9223372036854775807L) {
                            Log.w("SsaDecoder", r.length() == 0 ? new String("Skipping invalid timing: ") : "Skipping invalid timing: ".concat(r));
                        } else {
                            String str = split[this.f3596h];
                            if (!str.trim().isEmpty()) {
                                j = m3003b(str);
                                if (j == -9223372036854775807L) {
                                    Log.w("SsaDecoder", r.length() == 0 ? new String("Skipping invalid timing: ") : "Skipping invalid timing: ".concat(r));
                                }
                            } else {
                                j = -9223372036854775807L;
                            }
                            arrayList.add(new bdj(split[this.f3597i].replaceAll("\\{.*?}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                            bkq.mo2047a(b);
                            if (j != -9223372036854775807L) {
                                arrayList.add(bdj.f3406a);
                                bkq.mo2047a(j);
                            }
                        }
                    }
                } else {
                    Log.w("SsaDecoder", r.length() == 0 ? new String("Skipping dialogue line before complete format: ") : "Skipping dialogue line before complete format: ".concat(r));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m3002a(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 8
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            int r0 = r9.length
            r8.f3594f = r0
            r0 = -1
            r8.f3595g = r0
            r8.f3596h = r0
            r8.f3597i = r0
            r1 = 0
            r2 = 0
        L_0x0018:
            int r3 = r8.f3594f
            if (r2 < r3) goto L_0x002d
            int r9 = r8.f3595g
            if (r9 == r0) goto L_0x002a
            int r9 = r8.f3596h
            if (r9 == r0) goto L_0x002a
            int r9 = r8.f3597i
            if (r9 != r0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return
        L_0x002a:
            r8.f3594f = r1
            return
        L_0x002d:
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = p000.blm.m3675d(r3)
            int r4 = r3.hashCode()
            r5 = 100571(0x188db, float:1.4093E-40)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0062
            r5 = 3556653(0x36452d, float:4.983932E-39)
            if (r4 == r5) goto L_0x0058
            r5 = 109757538(0x68ac462, float:5.219839E-35)
            if (r4 == r5) goto L_0x004d
        L_0x004c:
            goto L_0x006c
        L_0x004d:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004c
            r3 = 0
            goto L_0x006d
        L_0x0058:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004c
            r3 = 2
            goto L_0x006d
        L_0x0062:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x004c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = -1
        L_0x006d:
            if (r3 == 0) goto L_0x007a
            if (r3 == r7) goto L_0x0077
            if (r3 == r6) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            r8.f3597i = r2
            goto L_0x007c
        L_0x0077:
            r8.f3596h = r2
            goto L_0x007c
        L_0x007a:
            r8.f3595g = r2
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bet.m3002a(java.lang.String):void");
    }

    /* renamed from: a */
    private static final void m3001a(bky bky) {
        String r;
        do {
            r = bky.mo2091r();
            if (r == null) {
                return;
            }
        } while (!r.startsWith("[Events]"));
    }

    /* renamed from: b */
    private static long m3003b(String str) {
        Matcher matcher = f3592d.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }
}
