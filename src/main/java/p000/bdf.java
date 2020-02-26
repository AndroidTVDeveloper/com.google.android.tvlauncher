package p000;

import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdf */
/* compiled from: PG */
final class bdf extends bdb {

    /* renamed from: a */
    private final List f3383a = new LinkedList();

    /* renamed from: b */
    private long f3384b;

    /* renamed from: c */
    private long f3385c;

    /* renamed from: d */
    private long f3386d;

    /* renamed from: e */
    private boolean f3387e;

    /* renamed from: f */
    private bcy f3388f = null;

    public bdf(String str) {
        super(null, str, "SmoothStreamingMedia");
    }

    /* renamed from: a */
    public final void mo1774a(Object obj) {
        boolean z;
        if (obj instanceof bcz) {
            this.f3383a.add((bcz) obj);
        } else if (obj instanceof bcy) {
            if (this.f3388f == null) {
                z = true;
            } else {
                z = false;
            }
            bks.m3512b(z);
            this.f3388f = (bcy) obj;
        }
    }

    /* renamed from: a */
    public final Object mo1771a() {
        int size = this.f3383a.size();
        bcz[] bczArr = new bcz[size];
        this.f3383a.toArray(bczArr);
        bcy bcy = this.f3388f;
        if (bcy != null) {
            anq anq = new anq(new anp(bcy.f3357a, "video/mp4", bcy.f3358b));
            for (int i = 0; i < size; i++) {
                bcz bcz = bczArr[i];
                int i2 = bcz.f3360a;
                if (i2 == 2 || i2 == 1) {
                    akh[] akhArr = bcz.f3362c;
                    for (int i3 = 0; i3 < akhArr.length; i3++) {
                        akhArr[i3] = akhArr[i3].mo423a(anq);
                    }
                }
            }
        }
        return new bda(this.f3384b, this.f3385c, this.f3386d, this.f3387e, this.f3388f, bczArr);
    }

    /* renamed from: b */
    public final void mo1776b(XmlPullParser xmlPullParser) {
        boolean z;
        m2868b(xmlPullParser, "MajorVersion");
        m2868b(xmlPullParser, "MinorVersion");
        this.f3384b = m2867a(xmlPullParser, "TimeScale", 10000000);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue != null) {
            try {
                this.f3385c = Long.parseLong(attributeValue);
                this.f3386d = m2867a(xmlPullParser, "DVRWindowLength", 0);
                m2866a(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                if (attributeValue2 != null) {
                    z = Boolean.parseBoolean(attributeValue2);
                } else {
                    z = false;
                }
                this.f3387e = z;
                mo1775a("TimeScale", Long.valueOf(this.f3384b));
            } catch (NumberFormatException e) {
                throw new ako(e);
            }
        } else {
            throw new bdc("Duration");
        }
    }
}
