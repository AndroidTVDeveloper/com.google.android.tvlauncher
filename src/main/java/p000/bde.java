package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bde */
/* compiled from: PG */
final class bde extends bdb {

    /* renamed from: a */
    private akh f3382a;

    public bde(bdb bdb, String str) {
        super(bdb, str, "QualityLevel");
    }

    /* renamed from: a */
    public final Object mo1771a() {
        return this.f3382a;
    }

    /* renamed from: c */
    private static List m2885c(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] g = blm.m3680g(str);
            if (bkg.m3482a(g, 0)) {
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                do {
                    arrayList2.add(Integer.valueOf(i));
                    i += bkg.f4207a.length;
                    int length = g.length - bkg.f4207a.length;
                    while (true) {
                        if (i <= length) {
                            if (bkg.m3482a(g, i)) {
                                continue;
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            continue;
                            break;
                        }
                    }
                } while (i != -1);
                bArr = new byte[arrayList2.size()][];
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    int intValue = ((Integer) arrayList2.get(i2)).intValue();
                    int intValue2 = (i2 < arrayList2.size() + -1 ? ((Integer) arrayList2.get(i2 + 1)).intValue() : g.length) - intValue;
                    byte[] bArr2 = new byte[intValue2];
                    System.arraycopy(g, intValue, bArr2, 0, intValue2);
                    bArr[i2] = bArr2;
                    i2++;
                }
            } else {
                bArr = null;
            }
            if (bArr != null) {
                Collections.addAll(arrayList, bArr);
            } else {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1776b(org.xmlpull.v1.XmlPullParser r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "Type"
            java.lang.Object r2 = r0.mo1772a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            java.lang.String r4 = "Index"
            java.lang.String r5 = r1.getAttributeValue(r3, r4)
            java.lang.String r4 = "Name"
            java.lang.Object r4 = r0.mo1772a(r4)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r4 = "Bitrate"
            int r10 = m2868b(r1, r4)
            java.lang.String r4 = "FourCC"
            java.lang.String r4 = m2869c(r1, r4)
            java.lang.String r7 = "H264"
            boolean r7 = r4.equalsIgnoreCase(r7)
            java.lang.String r8 = "audio/mp4a-latm"
            if (r7 == 0) goto L_0x0038
        L_0x0036:
            goto L_0x00e9
        L_0x0038:
            java.lang.String r7 = "X264"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x0036
            java.lang.String r7 = "AVC1"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00e9
            java.lang.String r7 = "DAVC"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00e9
            java.lang.String r7 = "AAC"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x005b
        L_0x0059:
            goto L_0x00e7
        L_0x005b:
            java.lang.String r7 = "AACL"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x0059
            java.lang.String r7 = "AACH"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00e7
            java.lang.String r7 = "AACP"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00e7
            java.lang.String r7 = "TTML"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x007d
        L_0x007b:
            goto L_0x00e4
        L_0x007d:
            java.lang.String r7 = "DFXP"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "ac-3"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x008e
        L_0x008d:
            goto L_0x00e1
        L_0x008e:
            java.lang.String r7 = "dac3"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x008d
            java.lang.String r7 = "ec-3"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x009f
        L_0x009e:
            goto L_0x00de
        L_0x009f:
            java.lang.String r7 = "dec3"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x009e
            java.lang.String r7 = "dtsc"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x00b2
            java.lang.String r4 = "audio/vnd.dts"
            goto L_0x00eb
        L_0x00b2:
            java.lang.String r7 = "dtsh"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x00bb
        L_0x00ba:
            goto L_0x00db
        L_0x00bb:
            java.lang.String r7 = "dtsl"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00ba
            java.lang.String r7 = "dtse"
            boolean r7 = r4.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x00ce
            java.lang.String r4 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00eb
        L_0x00ce:
            java.lang.String r7 = "opus"
            boolean r4 = r4.equalsIgnoreCase(r7)
            if (r4 == 0) goto L_0x00d9
            java.lang.String r4 = "audio/opus"
            goto L_0x00eb
        L_0x00d9:
            r4 = r3
            goto L_0x00eb
        L_0x00db:
            java.lang.String r4 = "audio/vnd.dts.hd"
            goto L_0x00eb
        L_0x00de:
            java.lang.String r4 = "audio/eac3"
            goto L_0x00eb
        L_0x00e1:
            java.lang.String r4 = "audio/ac3"
            goto L_0x00eb
        L_0x00e4:
            java.lang.String r4 = "application/ttml+xml"
            goto L_0x00eb
        L_0x00e7:
            r4 = r8
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r4 = "video/avc"
        L_0x00eb:
            r7 = 2
            java.lang.String r9 = "CodecPrivateData"
            if (r2 != r7) goto L_0x0115
            r2 = 0
            java.lang.String r7 = "MaxWidth"
            int r11 = m2868b(r1, r7)
            java.lang.String r7 = "MaxHeight"
            int r12 = m2868b(r1, r7)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r1 = r1.getAttributeValue(r3, r9)
            java.util.List r14 = m2885c(r1)
            r15 = 0
            r16 = 0
            java.lang.String r7 = "video/mp4"
            r8 = r4
            r9 = r2
            akh r1 = p000.akh.m739a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f3382a = r1
            return
        L_0x0115:
            java.lang.String r7 = "Language"
            r11 = 1
            if (r2 == r11) goto L_0x017e
            r1 = 3
            if (r2 != r1) goto L_0x0170
            java.lang.String r1 = "Subtype"
            java.lang.Object r1 = r0.mo1772a(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2061026(0x1f72e2, float:2.888113E-39)
            r8 = 0
            if (r2 == r3) goto L_0x0140
            r3 = 2094737(0x1ff691, float:2.935352E-39)
            if (r2 == r3) goto L_0x0135
        L_0x0134:
            goto L_0x014a
        L_0x0135:
            java.lang.String r2 = "DESC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0134
            r1 = 1
            goto L_0x014b
        L_0x0140:
            java.lang.String r2 = "CAPT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0134
            r1 = 0
            goto L_0x014b
        L_0x014a:
            r1 = -1
        L_0x014b:
            if (r1 == 0) goto L_0x0157
            if (r1 == r11) goto L_0x0151
            r11 = 0
            goto L_0x015c
        L_0x0151:
            r1 = 1024(0x400, float:1.435E-42)
            r11 = 1024(0x400, float:1.435E-42)
            goto L_0x015c
        L_0x0157:
            r1 = 64
            r11 = 64
        L_0x015c:
            r1 = 0
            java.lang.Object r2 = r0.mo1772a(r7)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r7 = "application/mp4"
            r8 = r4
            r9 = r10
            r10 = r1
            akh r1 = p000.akh.m738a(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f3382a = r1
            return
        L_0x0170:
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r7 = "application/mp4"
            r8 = r4
            akh r1 = p000.akh.m740a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.f3382a = r1
            return
        L_0x017e:
            if (r4 == 0) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r4 = r8
        L_0x0182:
            java.lang.String r2 = "Channels"
            int r11 = m2868b(r1, r2)
            java.lang.String r2 = "SamplingRate"
            int r12 = m2868b(r1, r2)
            java.lang.String r1 = r1.getAttributeValue(r3, r9)
            java.util.List r1 = m2885c(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01ab
            boolean r2 = r8.equals(r4)
            if (r2 == 0) goto L_0x01ab
            byte[] r1 = p000.bkg.m3483a(r12, r11)
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x01ab:
            r13 = r1
            r9 = 0
            r14 = 0
            r15 = 0
            java.lang.Object r1 = r0.mo1772a(r7)
            r16 = r1
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r7 = "audio/mp4"
            r8 = r4
            akh r1 = p000.akh.m742a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f3382a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bde.mo1776b(org.xmlpull.v1.XmlPullParser):void");
    }
}
