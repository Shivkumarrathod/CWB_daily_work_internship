
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import NoPage from './NoPage';
import TutorialsListComponent from './tutorials-list.component';
import AddTutorial from './AddTutorial';
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<TutorialsListComponent/>}/>
        <Route index element={<TutorialsListComponent/>} />
         <Route path="/tutorials" element={<TutorialsListComponent/>}/>
         <Route path="/addTutorials" element={<AddTutorial/>}/>

        <Route path="*" element={<NoPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
