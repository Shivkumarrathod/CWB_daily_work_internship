
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import AddTutorial from './components/AddTutorial-component';
import TutorialsListComponent from './components/TutorialList-component';
import Tutorial from './components/Tutorial-component';
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<TutorialsListComponent/>}/>
        <Route index element={<TutorialsListComponent/>} />
         <Route path="/tutorials" element={<TutorialsListComponent/>}/>
         <Route path="/tutorials/:id" element={<Tutorial/>}/>
         <Route path="/addTutorials" element={<AddTutorial/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;