package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: dlk  reason: default package */
/* compiled from: PG */
public class dlk {
    public void a(InstantVideoView instantVideoView) {
    }

    public static void a(Context context, String str) {
        Intent a = a(context, "com.android.tv.action.DISMISS_NOTIFICATION", "android.intent.action.DELETE");
        a.setPackage("com.google.android.tvrecommendations");
        a.putExtra("sbn_key", str);
        context.sendBroadcast(a);
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) ? intent : new Intent(str2);
    }

    public static boolean a(Cursor cursor) {
        if (cursor == null || cursor.isClosed() || !cursor.moveToFirst()) {
            return false;
        }
        while (!"Notification.NowPlaying".equals(cursor.getString(14))) {
            if (!cursor.moveToNext()) {
                return false;
            }
        }
        return true;
    }

    public static void b(Context context, String str) {
        Intent a = a(context, "com.android.tv.action.OPEN_NOTIFICATION", "android.intent.action.VIEW");
        a.setPackage("com.google.android.tvrecommendations");
        a.putExtra("sbn_key", str);
        context.sendBroadcast(a);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a2 : ((Map) obj).entrySet()) {
                a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(a(dik.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof dik) {
                sb.append(": \"");
                sb.append(a((dik) obj));
                sb.append('\"');
            } else if (obj instanceof dje) {
                sb.append(" {");
                a((dje) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                a(sb, i4, "key", entry.getKey());
                a(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static void a(dkk dkk, StringBuilder sb, int i) {
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : dkk.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, a(str2), dje.a(method2, dkk, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String str3 = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, a(str3), dje.a(method3, dkk, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() == 0 ? new String("set") : "set".concat(valueOf5))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() == 0 ? new String("get") : "get".concat(valueOf6))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String str4 = valueOf8.length() == 0 ? new String(valueOf7) : valueOf7.concat(valueOf8);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() == 0 ? new String("get") : "get".concat(valueOf9));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() == 0 ? new String("has") : "has".concat(valueOf10));
                if (method4 != null) {
                    Object a = dje.a(method4, dkk, new Object[0]);
                    if (method5 == null) {
                        if (a instanceof Boolean) {
                            z = !((Boolean) a).booleanValue();
                        } else if (a instanceof Integer) {
                            if (((Integer) a).intValue() == 0) {
                            }
                        } else if (a instanceof Float) {
                            if (((Float) a).floatValue() == 0.0f) {
                            }
                        } else if (a instanceof Double) {
                            if (((Double) a).doubleValue() == 0.0d) {
                            }
                        } else if (a instanceof String) {
                            z = a.equals("");
                        } else if (a instanceof dik) {
                            z = a.equals(dik.b);
                        } else if (a instanceof dkk) {
                            if (a == ((dkk) a).W()) {
                            }
                        } else if ((a instanceof Enum) && ((Enum) a).ordinal() == 0) {
                        }
                        if (z) {
                        }
                    } else if (!((Boolean) dje.a(method5, dkk, new Object[0])).booleanValue()) {
                    }
                    a(sb, i, a(str4), a);
                }
            }
        }
        if (dkk instanceof djc) {
            Iterator d = ((djc) dkk).a.d();
            if (d.hasNext()) {
                djd djd = (djd) ((Map.Entry) d.next()).getKey();
                throw null;
            }
        }
        dlm dlm = ((dje) dkk).A;
        if (dlm != null) {
            for (int i2 = 0; i2 < dlm.b; i2++) {
                a(sb, i, String.valueOf(dme.b(dlm.c[i2])), dlm.d[i2]);
            }
        }
    }

    static String a(dik dik) {
        dli dli = new dli(dik);
        StringBuilder sb = new StringBuilder(dli.a());
        for (int i = 0; i < dli.a(); i++) {
            byte a = dli.a.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            continue;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
