package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bdg  reason: default package */
/* compiled from: PG */
final class bdg extends bdb {
    private final String a;
    private final List b = new LinkedList();
    private int c;
    private String d;
    private long e;
    private String f;
    private String g;
    private ArrayList h;
    private long i;

    public bdg(bdb bdb, String str) {
        super(bdb, str, "StreamIndex");
        this.a = str;
    }

    public final void a(Object obj) {
        if (obj instanceof akh) {
            this.b.add((akh) obj);
        }
    }

    public final Object a() {
        akh[] akhArr = new akh[this.b.size()];
        this.b.toArray(akhArr);
        return new bcz(this.a, this.f, this.c, this.e, akhArr, this.h, this.i);
    }

    public final boolean b(String str) {
        return "c".equals(str);
    }

    public final void b(XmlPullParser xmlPullParser) {
        int i2 = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.h.size();
            long a2 = a(xmlPullParser, "t", -9223372036854775807L);
            if (a2 == -9223372036854775807L) {
                if (size == 0) {
                    a2 = 0;
                } else if (this.i != -1) {
                    a2 = this.i + ((Long) this.h.get(size - 1)).longValue();
                } else {
                    throw new ako("Unable to infer start time");
                }
            }
            this.h.add(Long.valueOf(a2));
            this.i = a(xmlPullParser, "d", -9223372036854775807L);
            long a3 = a(xmlPullParser, "r", 1);
            if (a3 <= 1 || this.i != -9223372036854775807L) {
                while (true) {
                    long j = (long) i2;
                    if (j < a3) {
                        this.h.add(Long.valueOf((this.i * j) + a2));
                        i2++;
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
                        i2 = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i2 = 3;
                    } else {
                        StringBuilder sb = new StringBuilder(attributeValue.length() + 19);
                        sb.append("Invalid key value[");
                        sb.append(attributeValue);
                        sb.append("]");
                        throw new ako(sb.toString());
                    }
                }
                this.c = i2;
                a("Type", Integer.valueOf(i2));
                if (this.c == 3) {
                    this.d = c(xmlPullParser, "Subtype");
                } else {
                    this.d = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                a("Subtype", this.d);
                xmlPullParser.getAttributeValue(null, "Name");
                this.f = c(xmlPullParser, "Url");
                a(xmlPullParser, "MaxWidth");
                a(xmlPullParser, "MaxHeight");
                a(xmlPullParser, "DisplayWidth");
                a(xmlPullParser, "DisplayHeight");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
                this.g = attributeValue2;
                a("Language", attributeValue2);
                long a4 = (long) a(xmlPullParser, "TimeScale");
                this.e = a4;
                if (a4 == -1) {
                    this.e = ((Long) a("TimeScale")).longValue();
                }
                this.h = new ArrayList();
                return;
            }
            throw new bdc("Type");
        }
    }
}
