package defpackage;

import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdd  reason: default package */
/* compiled from: PG */
final class bdd extends bdb {
    private boolean a;
    private UUID b;
    private byte[] c;

    public bdd(bdb bdb, String str) {
        super(bdb, str, "Protection");
    }

    public final Object a() {
        UUID uuid = this.b;
        byte[] a2 = bty.a(uuid, this.c);
        byte[] bArr = this.c;
        aqp[] aqpArr = new aqp[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        a(decode, 0, 3);
        a(decode, 1, 2);
        a(decode, 4, 5);
        a(decode, 6, 7);
        aqpArr[0] = new aqp(true, null, 8, decode, 0, 0, null);
        return new bcy(uuid, a2, aqpArr);
    }

    public final boolean b(String str) {
        return "ProtectionHeader".equals(str);
    }

    public final void d(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.a = false;
        }
    }

    public final void b(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.a = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.b = UUID.fromString(attributeValue);
        }
    }

    public final void c(XmlPullParser xmlPullParser) {
        if (this.a) {
            this.c = Base64.decode(xmlPullParser.getText(), 0);
        }
    }

    private static void a(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }
}
