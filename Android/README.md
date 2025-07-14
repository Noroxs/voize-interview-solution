# voize Kotlin Compose Challenge

Welcome to this challenge! It is very simple but very open-ended. 
You are tasked to visualize the data given in `data.kt` in a Kotlin Compose UI.
The data consists of patients and their care reports.

## Architecture

The application follows the MVVM (Model-View-ViewModel) architectural pattern:

*   **Model:** Represents the data layer. This includes:
    *   Data classes (e.g., `Patient`, `CareReport`).
    *   `PatientRepository`: Responsible for fetching data (currently from `MockPatientApiService`).
    *   `MockPatientApiService`: Simulates a network API service providing mock patient data.
*   **View:** Represents the UI layer, built with Jetpack Compose.
    *   **Screens/Composables:** (`PatientListScreen.kt`, `PatientDetailScreen.kt`, `PatientListCellView.kt`). These observe ViewModel state and render the UI.
    *   **Navigation:** (`Navigation.kt`) Defines the navigation graph and routes.
*   **ViewModel:** Acts as a bridge between the Model and the View.
    *   `PatientListViewModel`: Manages the state and logic for the patient list screen.
    *   `PatientDetailViewModel`: Manages the state and logic for the patient detail screen.
    *   They expose data to the UI via observable state.

## Note

* In `MainActivity` set `simulateNetworkDelayInMs` to change how long the `MockPatientApiService` simulates the loading time.
* In `MainActivity` set `patientData` to change the mocked patient data.

## Potential improvements

*   Implement actual network calls to a real backend
*   Improve tests specially for ViewModel classes
*   Add persistence layer for caching data
*	Add functionality like:
     *	Search for patients
     *	Filter for CareReport types
     *	Sort Patients & CareReports
     *	Create CareReports
     *	...
