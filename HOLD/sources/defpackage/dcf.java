package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: dcf  reason: default package */
/* compiled from: PG */
final class dcf {
    public static final Map a = new HashMap();
    public static dcf b;

    private static boolean b(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null && attributeValue.trim().equalsIgnoreCase("true");
    }

    private static Uri a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return Uri.parse(attributeValue);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128 A[Catch:{ IOException | XmlPullParserException -> 0x02a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dce a(java.io.InputStream r26) {
        /*
            r25 = this;
            java.lang.String r1 = "OemAppPromosXmlParser"
            dce r0 = new dce
            r0.<init>()
            org.xmlpull.v1.XmlPullParserFactory r3 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            org.xmlpull.v1.XmlPullParser r3 = r3.newPullParser()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r5 = r26
            r4.<init>(r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r3.setInput(r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.util.ArrayDeque r4 = new java.util.ArrayDeque     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r5 = 2
            r4.<init>(r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            int r6 = r3.getEventType()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            dcd r7 = new dcd     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r8 = 0
            r7.<init>(r8)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r9 = r6
            r6 = 0
        L_0x002b:
            if (r6 != 0) goto L_0x02a3
            r10 = 1
            if (r9 == r10) goto L_0x02a3
            if (r9 == r5) goto L_0x006b
            r10 = 3
            if (r9 == r10) goto L_0x003d
            r24 = r0
            r17 = r4
            r16 = r6
            goto L_0x0295
        L_0x003d:
            boolean r9 = r4.isEmpty()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            if (r9 != 0) goto L_0x0063
            java.lang.Object r9 = r4.pop()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r10 = r3.getName()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            boolean r9 = android.text.TextUtils.equals(r9, r10)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            if (r9 == 0) goto L_0x005b
            r24 = r0
            r17 = r4
            r16 = r6
            goto L_0x0295
        L_0x005b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r3 = "start and end tags don't match"
            r0.<init>(r3)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            throw r0     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
        L_0x0063:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r3 = "end tag without start tag"
            r0.<init>(r3)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            throw r0     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
        L_0x006b:
            java.lang.String r9 = r3.getName()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r4.push(r9)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r9 = " , package_name : "
            java.lang.String r11 = " , banner_uri : "
            java.lang.String r12 = " , data_uri : "
            java.lang.String r13 = " , is_game : "
            java.lang.String r14 = " , is_virtual_app : "
            java.lang.String r15 = " , developer : "
            java.lang.String r8 = " , category : "
            java.lang.String r2 = " , description : "
            java.lang.String r5 = r3.getName()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            int r10 = r5.hashCode()
            r17 = r4
            r4 = -416447130(0xffffffffe72d8566, float:-8.194302E23)
            if (r10 == r4) goto L_0x00b1
            r4 = 96801(0x17a21, float:1.35647E-40)
            if (r10 == r4) goto L_0x00a7
            r4 = 1907281966(0x71aed02e, float:1.7312661E30)
            if (r10 == r4) goto L_0x009c
        L_0x009b:
            goto L_0x00bb
        L_0x009c:
            java.lang.String r4 = "app-recommendations"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x009b
            r4 = 2
            goto L_0x00bc
        L_0x00a7:
            java.lang.String r4 = "app"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x009b
            r4 = 0
            goto L_0x00bc
        L_0x00b1:
            java.lang.String r4 = "screenshot"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x009b
            r4 = 1
            goto L_0x00bc
        L_0x00bb:
            r4 = -1
        L_0x00bc:
            if (r4 == 0) goto L_0x0128
            r10 = 1
            if (r4 == r10) goto L_0x0107
            r2 = 2
            if (r4 == r2) goto L_0x00ca
            r24 = r0
            r16 = r6
            goto L_0x0295
        L_0x00ca:
            java.lang.String r4 = "row_title"
            r8 = 0
            java.lang.String r4 = r3.getAttributeValue(r8, r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            if (r8 == 0) goto L_0x00ff
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            int r4 = r4.length()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            int r4 = r4 + 29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r4 = "Must supply row_title in "
            r6.append(r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r6.append(r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r4 = " tag"
            r6.append(r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            android.util.Log.e(r1, r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r24 = r0
            r6 = 1
            goto L_0x0297
        L_0x00ff:
            r0.c = r4     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
        L_0x0101:
            r24 = r0
            r16 = r6
            goto L_0x0295
        L_0x0107:
            r2 = 2
            dby r4 = r7.a     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            if (r4 == 0) goto L_0x0122
            java.lang.String r5 = "uri"
            android.net.Uri r5 = a(r3, r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            if (r5 == 0) goto L_0x011c
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r4.a(r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            goto L_0x0101
        L_0x011c:
            r24 = r0
            r16 = r6
            goto L_0x0295
        L_0x0122:
            r24 = r0
            r16 = r6
            goto L_0x0295
        L_0x0128:
            r4 = 2
            java.util.List r5 = r0.a     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            int r5 = r5.size()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r10 = 100
            if (r5 >= r10) goto L_0x0291
            java.lang.String r5 = "name"
            r10 = 0
            java.lang.String r5 = r3.getAttributeValue(r10, r5)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r4 = "package_name"
            java.lang.String r4 = r3.getAttributeValue(r10, r4)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            java.lang.String r10 = "banner_uri"
            android.net.Uri r10 = a(r3, r10)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r16 = r6
            java.lang.String r6 = "data_uri"
            android.net.Uri r6 = a(r3, r6)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r18 = r1
            java.lang.String r1 = "is_game"
            boolean r1 = b(r3, r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r19 = r2
            java.lang.String r2 = "is_virtual_app"
            boolean r2 = b(r3, r2)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r20 = r8
            java.lang.String r8 = "developer"
            r21 = r15
            r15 = 0
            java.lang.String r8 = r3.getAttributeValue(r15, r8)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r15 = "category"
            r22 = r14
            r14 = 0
            java.lang.String r15 = r3.getAttributeValue(r14, r15)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r14 = "description"
            r23 = r13
            r13 = 0
            java.lang.String r14 = r3.getAttributeValue(r13, r14)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            if (r5 != 0) goto L_0x017f
            r13 = 0
            goto L_0x01e6
        L_0x017f:
            if (r4 == 0) goto L_0x01e5
            if (r10 == 0) goto L_0x01e5
            if (r2 != 0) goto L_0x0186
            goto L_0x0196
        L_0x0186:
            if (r6 == 0) goto L_0x01e3
            if (r8 == 0) goto L_0x01e3
            if (r15 == 0) goto L_0x01e3
            java.util.Map r13 = defpackage.dcf.a     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            boolean r13 = r13.containsKey(r15)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            if (r13 == 0) goto L_0x01e1
            if (r14 == 0) goto L_0x01e1
        L_0x0196:
            dbx r9 = new dbx     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r13 = 0
            r9.<init>(r13)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.a = r5     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.b = r4     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r4 = r10.toString()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.c = r4     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            if (r6 == 0) goto L_0x01ad
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            goto L_0x01af
        L_0x01ad:
            r4 = 0
        L_0x01af:
            r9.d = r4     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.e = r8     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.util.Map r4 = defpackage.dcf.a     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.Object r4 = r4.get(r15)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.f = r4     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.g = r14     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.h = r1     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r9.i = r2     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            dby r1 = r9.a()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.util.HashSet r2 = r0.b     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            boolean r2 = r2.contains(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            if (r2 != 0) goto L_0x01d9
            java.util.List r2 = r0.a     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r2.add(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.util.HashSet r2 = r0.b     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r2.add(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
        L_0x01d9:
            r7.a = r1     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r24 = r0
            r1 = r18
            goto L_0x0295
        L_0x01e1:
            r13 = 0
            goto L_0x01e6
        L_0x01e3:
            r13 = 0
            goto L_0x01e6
        L_0x01e5:
            r13 = 0
        L_0x01e6:
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r24 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + 171
            java.lang.String r24 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            java.lang.String r24 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            java.lang.String r24 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            java.lang.String r24 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            java.lang.String r24 = java.lang.String.valueOf(r15)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            java.lang.String r24 = java.lang.String.valueOf(r14)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r24 = r24.length()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            int r13 = r13 + r24
            r24 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.<init>(r13)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r13 = "Missing data in promotion: name : "
            r0.append(r13)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r5)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r9)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r4)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r11)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r10)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r12)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r6)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r4 = r23
            r0.append(r4)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r1 = r22
            r0.append(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r2)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r1 = r21
            r0.append(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r8)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r1 = r20
            r0.append(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r15)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r1 = r19
            r0.append(r1)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r0.append(r14)     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x028d, XmlPullParserException -> 0x028b }
            r1 = r18
            android.util.Log.e(r1, r0)     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r2 = 0
            r7.a = r2     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            goto L_0x0295
        L_0x028b:
            r0 = move-exception
            goto L_0x028e
        L_0x028d:
            r0 = move-exception
        L_0x028e:
            r1 = r18
            goto L_0x02a9
        L_0x0291:
            r24 = r0
            r16 = r6
        L_0x0295:
            r6 = r16
        L_0x0297:
            int r9 = r3.next()     // Catch:{ IOException -> 0x02a8, XmlPullParserException -> 0x02a6 }
            r4 = r17
            r0 = r24
            r5 = 2
            r8 = 0
            goto L_0x002b
        L_0x02a3:
            r24 = r0
            return r24
        L_0x02a6:
            r0 = move-exception
            goto L_0x02a9
        L_0x02a8:
            r0 = move-exception
        L_0x02a9:
            java.lang.String r2 = "Error parsing configuration file"
            android.util.Log.e(r1, r2, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcf.a(java.io.InputStream):dce");
    }
}
