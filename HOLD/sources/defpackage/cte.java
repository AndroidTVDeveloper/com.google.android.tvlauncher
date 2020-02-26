package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: cte  reason: default package */
/* compiled from: PG */
public final class cte {
    public final Context a;
    public Resources b;
    public String c;

    public cte(Context context) {
        this.a = context;
    }

    public static void a(int i, int i2, String str) {
        if (i != i2) {
            throw new XmlPullParserException(str);
        }
    }

    public static void a(String str, String str2, String str3) {
        if (!str2.equals(str)) {
            throw new XmlPullParserException(str3);
        }
    }

    public final void a(String str) {
        if (!"1".equals(this.c)) {
            throw new XmlPullParserException(str);
        }
    }

    public final String a(XmlResourceParser xmlResourceParser, int i) {
        int attributeResourceValue = xmlResourceParser.getAttributeResourceValue(i, 0);
        if (attributeResourceValue != 0) {
            return this.b.getString(attributeResourceValue);
        }
        return xmlResourceParser.getAttributeValue(i);
    }
}
