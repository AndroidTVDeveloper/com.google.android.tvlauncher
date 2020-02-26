package defpackage;

import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdf  reason: default package */
/* compiled from: PG */
final class bdf extends bdb {
    private final List a = new LinkedList();
    private long b;
    private long c;
    private long d;
    private boolean e;
    private bcy f = null;

    public bdf(String str) {
        super(null, str, "SmoothStreamingMedia");
    }

    public final void a(Object obj) {
        boolean z;
        if (obj instanceof bcz) {
            this.a.add((bcz) obj);
        } else if (obj instanceof bcy) {
            if (this.f == null) {
                z = true;
            } else {
                z = false;
            }
            bks.b(z);
            this.f = (bcy) obj;
        }
    }

    public final Object a() {
        int size = this.a.size();
        bcz[] bczArr = new bcz[size];
        this.a.toArray(bczArr);
        bcy bcy = this.f;
        if (bcy != null) {
            anq anq = new anq(new anp(bcy.a, "video/mp4", bcy.b));
            for (int i = 0; i < size; i++) {
                bcz bcz = bczArr[i];
                int i2 = bcz.a;
                if (i2 == 2 || i2 == 1) {
                    akh[] akhArr = bcz.c;
                    for (int i3 = 0; i3 < akhArr.length; i3++) {
                        akhArr[i3] = akhArr[i3].a(anq);
                    }
                }
            }
        }
        return new bda(this.b, this.c, this.d, this.e, this.f, bczArr);
    }

    public final void b(XmlPullParser xmlPullParser) {
        boolean z;
        b(xmlPullParser, "MajorVersion");
        b(xmlPullParser, "MinorVersion");
        this.b = a(xmlPullParser, "TimeScale", 10000000);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.c = Long.parseLong(attributeValue);
                this.d = a(xmlPullParser, "DVRWindowLength", 0);
                a(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z = Boolean.parseBoolean(attributeValue2);
                } else {
                    z = false;
                }
                this.e = z;
                a("TimeScale", Long.valueOf(this.b));
            } catch (NumberFormatException e2) {
                throw new ako(e2);
            }
        } else {
            throw new bdc("Duration");
        }
    }
}
