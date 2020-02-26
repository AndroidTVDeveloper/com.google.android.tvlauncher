package defpackage;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: dcx  reason: default package */
/* compiled from: PG */
public final class dcx {
    public static Element a(Element element, String str) {
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (str.equals(element2.getLocalName())) {
                    return element2;
                }
            }
        }
        return null;
    }

    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf((Object) null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("No package was specified in the original intent: ");
            sb.append(valueOf);
            Log.e("PlayStoreIntentLauncher", sb.toString());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).build());
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    public static boolean a() {
        return ActivityManager.isRunningInTestHarness() || "robolectric".equals(Build.FINGERPRINT) || ActivityManager.isUserAMonkey();
    }
}
