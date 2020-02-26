package p000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdg */
/* compiled from: PG */
final class bdg extends bdb {

    /* renamed from: a */
    private final String f3389a;

    /* renamed from: b */
    private final List f3390b = new LinkedList();

    /* renamed from: c */
    private int f3391c;

    /* renamed from: d */
    private String f3392d;

    /* renamed from: e */
    private long f3393e;

    /* renamed from: f */
    private String f3394f;

    /* renamed from: g */
    private String f3395g;

    /* renamed from: h */
    private ArrayList f3396h;

    /* renamed from: i */
    private long f3397i;

    public bdg(bdb bdb, String str) {
        super(bdb, str, "StreamIndex");
        this.f3389a = str;
    }

    /* renamed from: a */
    public final void mo1774a(Object obj) {
        if (obj instanceof akh) {
            this.f3390b.add((akh) obj);
        }
    }

    /* renamed from: a */
    public final Object mo1771a() {
        akh[] akhArr = new akh[this.f3390b.size()];
        this.f3390b.toArray(akhArr);
        return new bcz(this.f3389a, this.f3394f, this.f3391c, this.f3393e, akhArr, this.f3396h, this.f3397i);
    }

    /* renamed from: b */
    public final boolean mo1777b(String str) {
        return "c".equals(str);
    }

    /* renamed from: b */
    public final void mo1776b(XmlPullParser xmlPullParser) {
        int i = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.f3396h.size();
            long a = m2867a(xmlPullParser, "t", -9223372036854775807L);
            if (a == -9223372036854775807L) {
                if (size == 0) {
                    a = 0;
                } else if (this.f3397i != -1) {
                    a = this.f3397i + ((Long) this.f3396h.get(size - 1)).longValue();
                } else {
                    throw new ako("Unable to infer start time");
                }
            }
            this.f3396h.add(Long.valueOf(a));
            this.f3397i = m2867a(xmlPullParser, "d", -9223372036854775807L);
            long a2 = m2867a(xmlPullParser, "r", 1);
            if (a2 <= 1 || this.f3397i != -9223372036854775807L) {
                while (true) {
                    long j = (long) i;
                    if (j < a2) {
                        this.f3396h.add(Long.valueOf((this.f3397i * j) + a));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new ako("Repeated chunk with unspecified duration");
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i = 3;
                    } else {
                        StringBuilder sb = new StringBuilder(attributeValue.length() + 19);
                        sb.append("Invalid key value[");
                        sb.append(attributeValue);
                        sb.append("]");
                        throw new ako(sb.toString());
                    }
                }
                this.f3391c = i;
                mo1775a("Type", Integer.valueOf(i));
                if (this.f3391c == 3) {
                    this.f3392d = m2869c(xmlPullParser, "Subtype");
                } else {
                    this.f3392d = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                mo1775a("Subtype", this.f3392d);
                xmlPullParser.getAttributeValue(null, "Name");
                this.f3394f = m2869c(xmlPullParser, "Url");
                m2866a(xmlPullParser, "MaxWidth");
                m2866a(xmlPullParser, "MaxHeight");
                m2866a(xmlPullParser, "DisplayWidth");
                m2866a(xmlPullParser, "DisplayHeight");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
                this.f3395g = attributeValue2;
                mo1775a("Language", attributeValue2);
                long a3 = (long) m2866a(xmlPullParser, "TimeScale");
                this.f3393e = a3;
                if (a3 == -1) {
                    this.f3393e = ((Long) mo1772a("TimeScale")).longValue();
                }
                this.f3396h = new ArrayList();
                return;
            }
            throw new bdc("Type");
        }
    }
}
