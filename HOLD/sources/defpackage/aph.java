package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aph  reason: default package */
/* compiled from: PG */
final class aph implements apf {
    public final /* synthetic */ apk a;

    public /* synthetic */ aph(apk apk) {
        this.a = apk;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(int i) {
        char c;
        int i2;
        int i3;
        List list;
        char c2;
        akh akh;
        float f;
        blp blp;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        String str;
        List list2;
        String str2;
        List list3;
        int i7;
        String str3;
        List list4;
        String str4;
        String str5;
        List list5;
        String str6;
        int b;
        String str7;
        List list6;
        aos aos;
        bkq bkq;
        int i8;
        bkq bkq2;
        int i9;
        int i10 = i;
        apk apk = this.a;
        int i11 = 0;
        if (i10 != 160) {
            if (i10 == 174) {
                String str8 = apk.i.b;
                if ("V_VP8".equals(str8) || "V_VP9".equals(str8) || "V_AV1".equals(str8) || "V_MPEG2".equals(str8) || "V_MPEG4/ISO/SP".equals(str8) || "V_MPEG4/ISO/ASP".equals(str8) || "V_MPEG4/ISO/AP".equals(str8) || "V_MPEG4/ISO/AVC".equals(str8) || "V_MPEGH/ISO/HEVC".equals(str8) || "V_MS/VFW/FOURCC".equals(str8) || "V_THEORA".equals(str8) || "A_OPUS".equals(str8) || "A_VORBIS".equals(str8) || "A_AAC".equals(str8) || "A_MPEG/L2".equals(str8) || "A_MPEG/L3".equals(str8) || "A_AC3".equals(str8) || "A_EAC3".equals(str8) || "A_TRUEHD".equals(str8) || "A_DTS".equals(str8) || "A_DTS/EXPRESS".equals(str8) || "A_DTS/LOSSLESS".equals(str8) || "A_FLAC".equals(str8) || "A_MS/ACM".equals(str8) || "A_PCM/INT/LIT".equals(str8) || "S_TEXT/UTF8".equals(str8) || "S_TEXT/ASS".equals(str8) || "S_VOBSUB".equals(str8) || "S_HDMV/PGS".equals(str8) || "S_DVBSUB".equals(str8)) {
                    api api = apk.i;
                    aok aok = apk.u;
                    int i12 = api.c;
                    String str9 = api.b;
                    int i13 = 3;
                    switch (str9.hashCode()) {
                        case -2095576542:
                            if (str9.equals("V_MPEG4/ISO/AP")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2095575984:
                            if (str9.equals("V_MPEG4/ISO/SP")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1985379776:
                            if (str9.equals("A_MS/ACM")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1784763192:
                            if (str9.equals("A_TRUEHD")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1730367663:
                            if (str9.equals("A_VORBIS")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1482641358:
                            if (str9.equals("A_MPEG/L2")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1482641357:
                            if (str9.equals("A_MPEG/L3")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1373388978:
                            if (str9.equals("V_MS/VFW/FOURCC")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case -933872740:
                            if (str9.equals("S_DVBSUB")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case -538363189:
                            if (str9.equals("V_MPEG4/ISO/ASP")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -538363109:
                            if (str9.equals("V_MPEG4/ISO/AVC")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case -425012669:
                            if (str9.equals("S_VOBSUB")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case -356037306:
                            if (str9.equals("A_DTS/LOSSLESS")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62923557:
                            if (str9.equals("A_AAC")) {
                                c = 13;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62923603:
                            if (str9.equals("A_AC3")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62927045:
                            if (str9.equals("A_DTS")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 82318131:
                            if (str9.equals("V_AV1")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 82338133:
                            if (str9.equals("V_VP8")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 82338134:
                            if (str9.equals("V_VP9")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99146302:
                            if (str9.equals("S_HDMV/PGS")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 444813526:
                            if (str9.equals("V_THEORA")) {
                                c = 10;
                                break;
                            }
                            c = 65535;
                            break;
                        case 542569478:
                            if (str9.equals("A_DTS/EXPRESS")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 725957860:
                            if (str9.equals("A_PCM/INT/LIT")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 738597099:
                            if (str9.equals("S_TEXT/ASS")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 855502857:
                            if (str9.equals("V_MPEGH/ISO/HEVC")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1422270023:
                            if (str9.equals("S_TEXT/UTF8")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1809237540:
                            if (str9.equals("V_MPEG2")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1950749482:
                            if (str9.equals("A_EAC3")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1950789798:
                            if (str9.equals("A_FLAC")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1951062397:
                            if (str9.equals("A_OPUS")) {
                                c = 12;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    String str10 = "audio/x-unknown";
                    switch (c) {
                        case 0:
                            str10 = "video/x-vnd.on2.vp8";
                            list = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 1:
                            str = "video/x-vnd.on2.vp9";
                            list2 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 2:
                            str = "video/av01";
                            list2 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 3:
                            str = "video/mpeg2";
                            list2 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            byte[] bArr2 = api.j;
                            if (bArr2 != null) {
                                list2 = Collections.singletonList(bArr2);
                            } else {
                                list2 = null;
                            }
                            str = "video/mp4v-es";
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 7:
                            bln a2 = bln.a(new bky(api.j));
                            List list7 = a2.a;
                            api.W = a2.b;
                            i3 = -1;
                            i2 = -1;
                            List list8 = list7;
                            str10 = "video/avc";
                            list = list8;
                            break;
                        case 8:
                            blt a3 = blt.a(new bky(api.j));
                            List list9 = a3.a;
                            api.W = a3.b;
                            i3 = -1;
                            i2 = -1;
                            List list10 = list9;
                            str10 = "video/hevc";
                            list = list10;
                            break;
                        case 9:
                            Pair a4 = api.a(new bky(api.j));
                            str10 = (String) a4.first;
                            list = (List) a4.second;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 10:
                            str2 = "video/x-unknown";
                            list3 = null;
                            i7 = -1;
                            i2 = -1;
                            break;
                        case 11:
                            list3 = api.a(api.j);
                            str2 = "audio/vorbis";
                            i7 = 8192;
                            i2 = -1;
                            break;
                        case 12:
                            list = new ArrayList(3);
                            list.add(api.j);
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(api.P).array());
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(api.Q).array());
                            str10 = "audio/opus";
                            i3 = 5760;
                            i2 = -1;
                            break;
                        case 13:
                            list = Collections.singletonList(api.j);
                            str10 = "audio/mp4a-latm";
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 14:
                            str4 = "audio/mpeg-L2";
                            list4 = null;
                            i3 = 4096;
                            i2 = -1;
                            break;
                        case 15:
                            str4 = "audio/mpeg";
                            list4 = null;
                            i3 = 4096;
                            i2 = -1;
                            break;
                        case 16:
                            str3 = "audio/ac3";
                            list4 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 17:
                            str3 = "audio/eac3";
                            list4 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 18:
                            api.R = new apj();
                            str3 = "audio/true-hd";
                            list4 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 19:
                        case 20:
                            str5 = "audio/vnd.dts";
                            list5 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 21:
                            str5 = "audio/vnd.dts.hd";
                            list5 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 22:
                            list5 = Collections.singletonList(api.j);
                            str5 = "audio/flac";
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 23:
                            if (api.b(new bky(api.j))) {
                                b = blm.b(api.N);
                                if (b == 0) {
                                    int i14 = api.N;
                                    StringBuilder sb = new StringBuilder(75);
                                    sb.append("Unsupported PCM bit depth: ");
                                    sb.append(i14);
                                    sb.append(". Setting mimeType to audio/x-unknown");
                                    str6 = sb.toString();
                                }
                                str10 = "audio/raw";
                                i2 = b;
                                list = null;
                                i3 = -1;
                                break;
                            } else {
                                str6 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                            }
                            Log.w("MatroskaExtractor", str6);
                            list = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 24:
                            b = blm.b(api.N);
                            if (b == 0) {
                                int i15 = api.N;
                                StringBuilder sb2 = new StringBuilder(75);
                                sb2.append("Unsupported PCM bit depth: ");
                                sb2.append(i15);
                                sb2.append(". Setting mimeType to audio/x-unknown");
                                Log.w("MatroskaExtractor", sb2.toString());
                                list = null;
                                i3 = -1;
                                i2 = -1;
                                break;
                            }
                            str10 = "audio/raw";
                            i2 = b;
                            list = null;
                            i3 = -1;
                            break;
                        case 25:
                            str7 = "application/x-subrip";
                            list6 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 26:
                            str7 = "text/x-ssa";
                            list6 = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 27:
                            list6 = Collections.singletonList(api.j);
                            str7 = "application/vobsub";
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 28:
                            str10 = "application/pgs";
                            list = null;
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 29:
                            byte[] bArr3 = api.j;
                            list = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                            str10 = "application/dvbsubs";
                            i3 = -1;
                            i2 = -1;
                            break;
                        default:
                            throw new ako("Unrecognized codec identifier.");
                    }
                    boolean z = api.T;
                    if (!api.S) {
                        c2 = 0;
                    } else {
                        c2 = 2;
                    }
                    boolean z2 = z | c2;
                    if (bkt.a(str10)) {
                        akh = akh.a(Integer.toString(i12), str10, -1, i3, api.M, api.O, i2, list, api.k, z2 ? 1 : 0, api.U);
                        i13 = 1;
                    } else if (bkt.b(str10)) {
                        if (api.p == 0) {
                            int i16 = api.n;
                            if (i16 == -1) {
                                i16 = api.l;
                            }
                            api.n = i16;
                            int i17 = api.o;
                            if (i17 == -1) {
                                i17 = api.m;
                            }
                            api.o = i17;
                        }
                        int i18 = api.n;
                        if (i18 == -1 || (i6 = api.o) == -1) {
                            f = -1.0f;
                        } else {
                            f = ((float) (api.m * i18)) / ((float) (api.l * i6));
                        }
                        if (api.w) {
                            if (api.C == -1.0f || api.D == -1.0f || api.E == -1.0f || api.F == -1.0f || api.G == -1.0f || api.H == -1.0f || api.I == -1.0f || api.J == -1.0f || api.K == -1.0f || api.L == -1.0f) {
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                wrap.put((byte) 0);
                                wrap.putShort((short) ((int) ((api.C * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.D * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.E * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.F * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.G * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.H * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.I * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.J * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) (api.K + 0.5f)));
                                wrap.putShort((short) ((int) (api.L + 0.5f)));
                                wrap.putShort((short) api.A);
                                wrap.putShort((short) api.B);
                            }
                            blp = new blp(api.x, api.z, api.y, bArr);
                        } else {
                            blp = null;
                        }
                        if (!"htc_video_rotA-000".equals(api.a)) {
                            i4 = !"htc_video_rotA-090".equals(api.a) ? !"htc_video_rotA-180".equals(api.a) ? "htc_video_rotA-270".equals(api.a) ? 270 : -1 : 180 : 90;
                        } else {
                            i4 = 0;
                        }
                        if (api.q == 0 && Float.compare(api.r, 0.0f) == 0 && Float.compare(api.s, 0.0f) == 0) {
                            if (Float.compare(api.t, 0.0f) == 0) {
                                i5 = 0;
                            } else if (Float.compare(api.s, 90.0f) == 0) {
                                i5 = 90;
                            } else if (Float.compare(api.s, -180.0f) == 0 || Float.compare(api.s, 180.0f) == 0) {
                                i5 = 180;
                            } else if (Float.compare(api.s, -90.0f) == 0) {
                                i5 = 270;
                            }
                            akh = akh.a(Integer.toString(i12), str10, null, i3, api.l, api.m, list, i5, f, api.u, api.v, blp, api.k);
                            i13 = 2;
                        }
                        i5 = i4;
                        akh = akh.a(Integer.toString(i12), str10, null, i3, api.l, api.m, list, i5, f, api.u, api.v, blp, api.k);
                        i13 = 2;
                    } else if ("application/x-subrip".equals(str10)) {
                        akh = akh.a(Integer.toString(i12), str10, z2 ? 1 : 0, api.U, api.k);
                    } else if ("text/x-ssa".equals(str10)) {
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(apk.a);
                        arrayList.add(api.j);
                        akh = akh.a(Integer.toString(i12), str10, z2 ? 1 : 0, api.U, -1, api.k, Long.MAX_VALUE, arrayList);
                    } else if ("application/vobsub".equals(str10) || "application/pgs".equals(str10) || "application/dvbsubs".equals(str10)) {
                        akh = akh.a(Integer.toString(i12), str10, z2 ? 1 : 0, list, api.U, api.k);
                    } else {
                        throw new ako("Unexpected MIME type.");
                    }
                    api.V = aok.a(api.c, i13);
                    api.V.a(akh);
                    SparseArray sparseArray = apk.c;
                    api api2 = apk.i;
                    sparseArray.put(api2.c, api2);
                }
                apk.i = null;
            } else if (i10 == 19899) {
                int i19 = apk.k;
                if (i19 != -1) {
                    long j = apk.l;
                    if (j != -1) {
                        if (i19 == 475249515) {
                            apk.m = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ako("Mandatory element SeekID or SeekPosition not found");
            } else if (i10 == 25152) {
                api api3 = apk.i;
                if (!api3.g) {
                    return;
                }
                if (api3.i != null) {
                    api3.k = new anq(new anp(aja.a, "video/webm", apk.i.i.b));
                    return;
                }
                throw new ako("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i10 == 28032) {
                api api4 = apk.i;
                if (api4.g && api4.h != null) {
                    throw new ako("Combining encryption and compression is not supported");
                }
            } else if (i10 == 357149030) {
                if (apk.f == -9223372036854775807L) {
                    apk.f = 1000000;
                }
                long j2 = apk.g;
                if (j2 != -9223372036854775807L) {
                    apk.h = apk.a(j2);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515 && !apk.j) {
                    aok aok2 = apk.u;
                    if (apk.e == -1 || apk.h == -9223372036854775807L || (bkq = apk.n) == null || (i8 = bkq.a) == 0 || (bkq2 = apk.o) == null || bkq2.a != i8) {
                        apk.n = null;
                        apk.o = null;
                        aos = new aor(apk.h);
                    } else {
                        int[] iArr = new int[i8];
                        long[] jArr = new long[i8];
                        long[] jArr2 = new long[i8];
                        long[] jArr3 = new long[i8];
                        for (int i20 = 0; i20 < i8; i20++) {
                            jArr3[i20] = apk.n.a(i20);
                            jArr[i20] = apk.e + apk.o.a(i20);
                        }
                        while (true) {
                            i9 = i8 - 1;
                            if (i11 >= i9) {
                                break;
                            }
                            int i21 = i11 + 1;
                            iArr[i11] = (int) (jArr[i21] - jArr[i11]);
                            jArr2[i11] = jArr3[i21] - jArr3[i11];
                            i11 = i21;
                        }
                        iArr[i9] = (int) ((apk.e + apk.d) - jArr[i9]);
                        jArr2[i9] = apk.h - jArr3[i9];
                        apk.n = null;
                        apk.o = null;
                        aos = new aod(iArr, jArr, jArr2, jArr3);
                    }
                    aok2.a(aos);
                    apk.j = true;
                }
            } else if (apk.c.size() != 0) {
                apk.u.S();
            } else {
                throw new ako("No valid tracks were found");
            }
        } else if (apk.p == 2) {
            if (!apk.t) {
                apk.s |= 1;
            }
            apk.a((api) apk.c.get(apk.r), apk.q);
            apk.p = 0;
        }
    }
}
