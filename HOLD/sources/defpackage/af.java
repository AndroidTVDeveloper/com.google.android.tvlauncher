package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: af  reason: default package */
/* compiled from: PG */
public final class af extends lr {
    private boolean b;
    private boolean c;
    private boolean d = true;

    public af() {
        bg bgVar = (bg) dc.a(new ae(this), "callbacks == null");
        new bq();
        new o(this);
    }

    private static void a(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.b);
        printWriter.print(" mResumed=");
        printWriter.print(this.c);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        if (getApplication() != null) {
            if (getApplication() != null) {
                if (this.a == null) {
                    lq lqVar = (lq) getLastNonConfigurationInstance();
                    if (lqVar != null) {
                        this.a = lqVar.a;
                    }
                    if (this.a == null) {
                        this.a = new y();
                    }
                }
                ao aoVar = new ap(this, this.a).a;
                if (aoVar.a.e > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    str2 + "    ";
                    de deVar = aoVar.a;
                    if (deVar.e > 0) {
                        am amVar = (am) deVar.b(0);
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(aoVar.a.a(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            } else {
                throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            }
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        throw null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        throw null;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        super.onCreatePanelMenu(0, menu);
        getMenuInflater();
        throw null;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        throw null;
    }

    public final void onLowMemory() {
        super.onLowMemory();
        throw null;
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            throw null;
        } else if (i != 6) {
            return false;
        } else {
            throw null;
        }
    }

    public final void onMultiWindowModeChanged(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        throw null;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (i != 0) {
            super.onPanelClosed(i, menu);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        this.c = false;
        throw null;
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        throw null;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        super.onPreparePanel(0, view, menu);
        throw null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.c = true;
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        j jVar = j.DESTROYED;
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            throw null;
        }
        throw null;
    }

    public final void onStateNotSaved() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        this.d = true;
        throw null;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
