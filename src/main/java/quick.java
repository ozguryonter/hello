import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.keep.v1.Keep;
import com.google.api.services.keep.v1.Keep.Media.Download;
import com.google.api.services.keep.v1.model.AddPermissionsRequest;
import com.google.api.services.keep.v1.model.AddPermissionsResponse;
import com.google.api.services.keep.v1.model.ListNotesResponse;
import com.google.api.services.keep.v1.model.Note;
import com.google.api.services.keep.v1.model.Permission;
import com.google.api.services.keep.v1.model.Scope;
import com.google.api.services.keep.v1.model.Section;
import com.google.api.services.keep.v1.model.TextContent;
import com.google.api.services.keep.v1.model.User;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KeepQuickstart {

  public static void main(String... args)  {
    KeepQuickstart instance = new KeepQuickstart();
    System.out.println("My name is");
  }
}
