package p000;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aph */
/* compiled from: PG */
final class aph implements apf {

    /* renamed from: a */
    public final /* synthetic */ apk f1582a;

    public /* synthetic */ aph(apk apk) {
        this.f1582a = apk;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo1229a(int i) {
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
        apk apk = this.f1582a;
        int i11 = 0;
        if (i10 != 160) {
            if (i10 == 174) {
                String str8 = apk.f1683i.f1607b;
                if ("V_VP8".equals(str8) || "V_VP9".equals(str8) || "V_AV1".equals(str8) || "V_MPEG2".equals(str8) || "V_MPEG4/ISO/SP".equals(str8) || "V_MPEG4/ISO/ASP".equals(str8) || "V_MPEG4/ISO/AP".equals(str8) || "V_MPEG4/ISO/AVC".equals(str8) || "V_MPEGH/ISO/HEVC".equals(str8) || "V_MS/VFW/FOURCC".equals(str8) || "V_THEORA".equals(str8) || "A_OPUS".equals(str8) || "A_VORBIS".equals(str8) || "A_AAC".equals(str8) || "A_MPEG/L2".equals(str8) || "A_MPEG/L3".equals(str8) || "A_AC3".equals(str8) || "A_EAC3".equals(str8) || "A_TRUEHD".equals(str8) || "A_DTS".equals(str8) || "A_DTS/EXPRESS".equals(str8) || "A_DTS/LOSSLESS".equals(str8) || "A_FLAC".equals(str8) || "A_MS/ACM".equals(str8) || "A_PCM/INT/LIT".equals(str8) || "S_TEXT/UTF8".equals(str8) || "S_TEXT/ASS".equals(str8) || "S_VOBSUB".equals(str8) || "S_HDMV/PGS".equals(str8) || "S_DVBSUB".equals(str8)) {
                    C0016api api = apk.f1683i;
                    aok aok = apk.f1695u;
                    int i12 = api.f1608c;
                    String str9 = api.f1607b;
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
                            byte[] bArr2 = api.f1615j;
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
                            bln a = bln.m3683a(new bky(api.f1615j));
                            List list7 = a.f4305a;
                            api.f1605W = a.f4306b;
                            i3 = -1;
                            i2 = -1;
                            List list8 = list7;
                            str10 = "video/avc";
                            list = list8;
                            break;
                        case 8:
                            blt a2 = blt.m3687a(new bky(api.f1615j));
                            List list9 = a2.f4325a;
                            api.f1605W = a2.f4326b;
                            i3 = -1;
                            i2 = -1;
                            List list10 = list9;
                            str10 = "video/hevc";
                            list = list10;
                            break;
                        case 9:
                            Pair a3 = C0016api.m1715a(new bky(api.f1615j));
                            str10 = (String) a3.first;
                            list = (List) a3.second;
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
                            list3 = C0016api.m1716a(api.f1615j);
                            str2 = "audio/vorbis";
                            i7 = 8192;
                            i2 = -1;
                            break;
                        case 12:
                            list = new ArrayList(3);
                            list.add(api.f1615j);
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(api.f1598P).array());
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(api.f1599Q).array());
                            str10 = "audio/opus";
                            i3 = 5760;
                            i2 = -1;
                            break;
                        case 13:
                            list = Collections.singletonList(api.f1615j);
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
                            api.f1600R = new apj();
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
                            list5 = Collections.singletonList(api.f1615j);
                            str5 = "audio/flac";
                            i3 = -1;
                            i2 = -1;
                            break;
                        case 23:
                            if (C0016api.m1717b(new bky(api.f1615j))) {
                                b = blm.m3659b(api.f1596N);
                                if (b == 0) {
                                    int i14 = api.f1596N;
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
                            b = blm.m3659b(api.f1596N);
                            if (b == 0) {
                                int i15 = api.f1596N;
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
                            list6 = Collections.singletonList(api.f1615j);
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
                            byte[] bArr3 = api.f1615j;
                            list = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                            str10 = "application/dvbsubs";
                            i3 = -1;
                            i2 = -1;
                            break;
                        default:
                            throw new ako("Unrecognized codec identifier.");
                    }
                    boolean z = api.f1602T;
                    if (!api.f1601S) {
                        c2 = 0;
                    } else {
                        c2 = 2;
                    }
                    boolean z2 = z | c2;
                    if (bkt.m3515a(str10)) {
                        akh = akh.m730a(Integer.toString(i12), str10, -1, i3, api.f1595M, api.f1597O, i2, list, api.f1616k, z2 ? 1 : 0, api.f1603U);
                        i13 = 1;
                    } else if (bkt.m3516b(str10)) {
                        if (api.f1621p == 0) {
                            int i16 = api.f1619n;
                            if (i16 == -1) {
                                i16 = api.f1617l;
                            }
                            api.f1619n = i16;
                            int i17 = api.f1620o;
                            if (i17 == -1) {
                                i17 = api.f1618m;
                            }
                            api.f1620o = i17;
                        }
                        int i18 = api.f1619n;
                        if (i18 == -1 || (i6 = api.f1620o) == -1) {
                            f = -1.0f;
                        } else {
                            f = ((float) (api.f1618m * i18)) / ((float) (api.f1617l * i6));
                        }
                        if (api.f1628w) {
                            if (api.f1585C == -1.0f || api.f1586D == -1.0f || api.f1587E == -1.0f || api.f1588F == -1.0f || api.f1589G == -1.0f || api.f1590H == -1.0f || api.f1591I == -1.0f || api.f1592J == -1.0f || api.f1593K == -1.0f || api.f1594L == -1.0f) {
                                bArr = null;
                            } else {
                                bArr = new byte[25];
                                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                                wrap.put((byte) 0);
                                wrap.putShort((short) ((int) ((api.f1585C * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1586D * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1587E * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1588F * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1589G * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1590H * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1591I * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) ((api.f1592J * 50000.0f) + 0.5f)));
                                wrap.putShort((short) ((int) (api.f1593K + 0.5f)));
                                wrap.putShort((short) ((int) (api.f1594L + 0.5f)));
                                wrap.putShort((short) api.f1583A);
                                wrap.putShort((short) api.f1584B);
                            }
                            blp = new blp(api.f1629x, api.f1631z, api.f1630y, bArr);
                        } else {
                            blp = null;
                        }
                        if (!"htc_video_rotA-000".equals(api.f1606a)) {
                            i4 = !"htc_video_rotA-090".equals(api.f1606a) ? !"htc_video_rotA-180".equals(api.f1606a) ? "htc_video_rotA-270".equals(api.f1606a) ? 270 : -1 : 180 : 90;
                        } else {
                            i4 = 0;
                        }
                        if (api.f1622q == 0 && Float.compare(api.f1623r, 0.0f) == 0 && Float.compare(api.f1624s, 0.0f) == 0) {
                            if (Float.compare(api.f1625t, 0.0f) == 0) {
                                i5 = 0;
                            } else if (Float.compare(api.f1624s, 90.0f) == 0) {
                                i5 = 90;
                            } else if (Float.compare(api.f1624s, -180.0f) == 0 || Float.compare(api.f1624s, 180.0f) == 0) {
                                i5 = 180;
                            } else if (Float.compare(api.f1624s, -90.0f) == 0) {
                                i5 = 270;
                            }
                            akh = akh.m736a(Integer.toString(i12), str10, null, i3, api.f1617l, api.f1618m, list, i5, f, api.f1626u, api.f1627v, blp, api.f1616k);
                            i13 = 2;
                        }
                        i5 = i4;
                        akh = akh.m736a(Integer.toString(i12), str10, null, i3, api.f1617l, api.f1618m, list, i5, f, api.f1626u, api.f1627v, blp, api.f1616k);
                        i13 = 2;
                    } else if ("application/x-subrip".equals(str10)) {
                        akh = akh.m733a(Integer.toString(i12), str10, z2 ? 1 : 0, api.f1603U, api.f1616k);
                    } else if ("text/x-ssa".equals(str10)) {
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(apk.f1638a);
                        arrayList.add(api.f1615j);
                        akh = akh.m732a(Integer.toString(i12), str10, z2 ? 1 : 0, api.f1603U, -1, api.f1616k, Long.MAX_VALUE, arrayList);
                    } else if ("application/vobsub".equals(str10) || "application/pgs".equals(str10) || "application/dvbsubs".equals(str10)) {
                        akh = akh.m734a(Integer.toString(i12), str10, z2 ? 1 : 0, list, api.f1603U, api.f1616k);
                    } else {
                        throw new ako("Unexpected MIME type.");
                    }
                    api.f1604V = aok.mo1211a(api.f1608c, i13);
                    api.f1604V.mo1204a(akh);
                    SparseArray sparseArray = apk.f1677c;
                    C0016api api2 = apk.f1683i;
                    sparseArray.put(api2.f1608c, api2);
                }
                apk.f1683i = null;
            } else if (i10 == 19899) {
                int i19 = apk.f1685k;
                if (i19 != -1) {
                    long j = apk.f1686l;
                    if (j != -1) {
                        if (i19 == 475249515) {
                            apk.f1687m = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ako("Mandatory element SeekID or SeekPosition not found");
            } else if (i10 == 25152) {
                C0016api api3 = apk.f1683i;
                if (!api3.f1612g) {
                    return;
                }
                if (api3.f1614i != null) {
                    api3.f1616k = new anq(new anp(aja.f429a, "video/webm", apk.f1683i.f1614i.f1523b));
                    return;
                }
                throw new ako("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i10 == 28032) {
                C0016api api4 = apk.f1683i;
                if (api4.f1612g && api4.f1613h != null) {
                    throw new ako("Combining encryption and compression is not supported");
                }
            } else if (i10 == 357149030) {
                if (apk.f1680f == -9223372036854775807L) {
                    apk.f1680f = 1000000;
                }
                long j2 = apk.f1681g;
                if (j2 != -9223372036854775807L) {
                    apk.f1682h = apk.mo1230a(j2);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515 && !apk.f1684j) {
                    aok aok2 = apk.f1695u;
                    if (apk.f1679e == -1 || apk.f1682h == -9223372036854775807L || (bkq = apk.f1688n) == null || (i8 = bkq.f4231a) == 0 || (bkq2 = apk.f1689o) == null || bkq2.f4231a != i8) {
                        apk.f1688n = null;
                        apk.f1689o = null;
                        aos = new aor(apk.f1682h);
                    } else {
                        int[] iArr = new int[i8];
                        long[] jArr = new long[i8];
                        long[] jArr2 = new long[i8];
                        long[] jArr3 = new long[i8];
                        for (int i20 = 0; i20 < i8; i20++) {
                            jArr3[i20] = apk.f1688n.mo2046a(i20);
                            jArr[i20] = apk.f1679e + apk.f1689o.mo2046a(i20);
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
                        iArr[i9] = (int) ((apk.f1679e + apk.f1678d) - jArr[i9]);
                        jArr2[i9] = apk.f1682h - jArr3[i9];
                        apk.f1688n = null;
                        apk.f1689o = null;
                        aos = new aod(iArr, jArr, jArr2, jArr3);
                    }
                    aok2.mo1212a(aos);
                    apk.f1684j = true;
                }
            } else if (apk.f1677c.size() != 0) {
                apk.f1695u.mo1210S();
            } else {
                throw new ako("No valid tracks were found");
            }
        } else if (apk.f1690p == 2) {
            if (!apk.f1694t) {
                apk.f1693s |= 1;
            }
            apk.mo1231a((C0016api) apk.f1677c.get(apk.f1692r), apk.f1691q);
            apk.f1690p = 0;
        }
    }
}
