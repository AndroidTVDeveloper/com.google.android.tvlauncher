package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: ep */
/* compiled from: PG */
public final class C0126ep implements ActionMode.Callback {

    /* renamed from: a */
    private final ActionMode.Callback f9156a;

    /* renamed from: b */
    private final TextView f9157b;

    /* renamed from: c */
    private Class f9158c;

    /* renamed from: d */
    private Method f9159d;

    /* renamed from: e */
    private boolean f9160e;

    /* renamed from: f */
    private boolean f9161f = false;

    public C0126ep(ActionMode.Callback callback, TextView textView) {
        this.f9156a = callback;
        this.f9157b = textView;
    }

    /* renamed from: a */
    private static final Intent m7260a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f9156a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f9156a.onCreateActionMode(actionMode, menu);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f9156a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method method;
        boolean z;
        Context context = this.f9157b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f9161f) {
            this.f9161f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f9158c = cls;
                this.f9159d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f9160e = true;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                this.f9158c = null;
                this.f9159d = null;
                this.f9160e = false;
            }
        }
        try {
            if (!this.f9160e || !this.f9158c.isInstance(menu)) {
                method = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            } else {
                method = this.f9159d;
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    method.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo next : packageManager.queryIntentActivities(m7260a(), 0)) {
                    if (context.getPackageName().equals(next.activityInfo.packageName) || (next.activityInfo.exported && (next.activityInfo.permission == null || context.checkSelfPermission(next.activityInfo.permission) == 0))) {
                        arrayList.add(next);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
                TextView textView = this.f9157b;
                Intent a = m7260a();
                if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                    z = false;
                } else {
                    z = true;
                }
                add.setIntent(a.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
        }
        return this.f9156a.onPrepareActionMode(actionMode, menu);
    }
}
