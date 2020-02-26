package defpackage;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* renamed from: cnf  reason: default package */
/* compiled from: PG */
public final class cnf {
    public final List a = new ArrayList();
    private final Map b = new HashMap();

    public final void a(String str, dej dej) {
        Object obj = (List) this.b.get(str);
        if (obj == null) {
            obj = new ArrayList();
            this.b.put(str, obj);
        }
        obj.add(dej);
    }

    public final void b(String str, String str2) {
        a(str, new cnc(this, str2));
    }

    public final void a(String str, cne cne) {
        a(str, new cmz(this, cne));
    }

    public static final void a(Object obj, String str, Object obj2) {
        Object obj3;
        int i;
        for (Method method : obj.getClass().getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == 1) {
                Class<?> cls = method.getParameterTypes()[0];
                if (cls.isInstance(obj2)) {
                    obj3 = obj2;
                } else if (cls == Integer.TYPE) {
                    try {
                        i = Integer.parseInt(obj2.toString());
                    } catch (NumberFormatException e) {
                        i = 0;
                    }
                    obj3 = Integer.valueOf(i);
                } else {
                    obj3 = cls == Boolean.TYPE ? Boolean.valueOf(Boolean.parseBoolean(obj2.toString())) : cls.getComponentType() == null ? null : ((List) obj2).toArray();
                }
                if (obj3 != null) {
                    try {
                        method.invoke(obj, obj3);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(valueOf).length());
        sb.append("Did not find method '");
        sb.append(str);
        sb.append("' in ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    static final String a(Element element, String str) {
        return element.getAttribute(str).trim();
    }

    static final String a(Element element) {
        return element != null ? element.getTextContent().trim() : "";
    }

    public final void a(InputStream inputStream) {
        cev.a(true);
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setNamespaceAware(true);
            Element documentElement = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            String localName = documentElement.getLocalName();
            for (String str : new HashSet(this.b.keySet())) {
                if (str.startsWith("*")) {
                    List list = (List) this.b.remove(str);
                    Map map = this.b;
                    String valueOf = String.valueOf(localName);
                    String valueOf2 = String.valueOf(str.substring(1));
                    map.put(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), list);
                }
            }
            b(documentElement, "");
        } catch (ParserConfigurationException | SAXException e) {
            throw new cnd(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object a() {
        cev.a(!this.a.isEmpty());
        List list = this.a;
        return list.get(list.size() - 1);
    }

    private final void b(Element element, String str) {
        String str2;
        if (!str.isEmpty()) {
            str2 = "/";
        } else {
            str2 = "";
        }
        String nodeName = element.getNodeName();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + str2.length() + String.valueOf(nodeName).length());
        sb.append(str);
        sb.append(str2);
        sb.append(nodeName);
        String sb2 = sb.toString();
        if (this.b.get(sb2) != null) {
            for (dej a2 : (List) this.b.get(sb2)) {
                a2.a(element);
            }
        }
        NodeList childNodes = element.getChildNodes();
        ArrayList arrayList = new ArrayList(childNodes.getLength());
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                arrayList.add((Element) item);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            b((Element) arrayList.get(i2), sb2);
        }
        if (this.b.get(sb2) != null) {
            for (dej a3 : (List) this.b.get(sb2)) {
                a3.a();
            }
        }
    }

    public static final void b(Object obj, String str, Object obj2) {
        String upperCase = str.substring(0, 1).toUpperCase();
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder(String.valueOf(upperCase).length() + 3 + String.valueOf(substring).length());
        sb.append("set");
        sb.append(upperCase);
        sb.append(substring);
        a(obj, sb.toString(), obj2);
    }

    public final void a(String str, String str2) {
        a(str, new cnb(this, str2));
    }

    public final void a(String str, String str2, String str3) {
        a(str, new cna(this, str2, str3));
    }
}
